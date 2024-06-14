package com.shoestore.service;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoestore.dao.ShoeDAO;
import com.shoestore.dao.TypeDAO;
import com.shoestore.entity.Type;



public class TypeServices {
	private TypeDAO typeDAO;
	private HttpServletRequest request;
	private HttpServletResponse response;
	
	public TypeServices(HttpServletRequest request, HttpServletResponse response) {
		super();
		this.request = request;
		this.response = response;

		typeDAO = new TypeDAO();
	}

	//Lấy danh sách các loại giày không kèm theo thông báo
	public void listType() throws ServletException, IOException {
		listType(null);
	}
	
	//Lấy danh sách các loại giày kèm theo thông báo
	public void listType(String message) throws ServletException, IOException {
		List<Type> listType = typeDAO.listAll();
		
		//Đẩy danh sách qua view bằng 
		request.setAttribute("listType", listType);
		
		if(message != null) {
			request.setAttribute("message", message);
		}
		
		String path = "/admin/type_list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
		
		requestDispatcher.forward(request, response);
	}
	
	//Tạo 1 loại giày mới
	public void createType() throws ServletException, IOException {
		String typeName = request.getParameter("typeName");
		
		//Kiểm tra có trùng loại giày có sẵn hay không
		Type existType = typeDAO.findByName(typeName);
		
		//Trùng loại giày có sẵn
		if(existType != null) {
			String message = "Could not create new type. Type already exists with the name: " + typeName;
			request.setAttribute("message", message);
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("message.jsp");
			
			requestDispatcher.forward(request, response);
		}
		
		//Không trùng loại giày có sẵn
		else {
			//Tạo 1 object type mới
			Type type = new Type(typeName);
			
			//Đẩy object type mới vừa tạo xuống model để thêm vào database
			typeDAO.create(type);
			
			String message = "A new type has been added successfully";
			
			//Refresh lại trang bằng cách liệt kê lại danh sách các loại giày
			listType(message);
		}
	}
	
	//Điều hướng đến trang edit
	//Hiển thị dữ liệu lên form để edit
	public void editType() throws ServletException, IOException {
		//Lấy ra id của loại giầy từ view
		int typeId = Integer.parseInt(request.getParameter("id"));
		
		//Tạo 1 object type để lưu dữ liệu của type được edit theo id vừa lấy
		Type type = typeDAO.get(typeId);
		
		//Đẩy type qua view
		request.setAttribute("type", type);
		
		String path = "type_form.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(path);
		requestDispatcher.forward(request, response);
	}

	//Cập nhật dữ liệu lên db sau khi đã hiệu chỉnh trên form
	public void updateType() throws ServletException, IOException {
		//Lấy ra id và tên của type vừa edit
		int typeId = Integer.parseInt(request.getParameter("typeId"));
		String typeName = request.getParameter("typeName");
		
		//Tìm type theo id
		Type typeById = typeDAO.get(typeId);
		
		//Tìm type theo tên của type
		Type typeByName = typeDAO.findByName(typeName);
		
		//Nếu như tồn type theo tên nhưng id của type theo tên và id của type theo id lại khác nhau
		//Điều này đồng nghĩa với việc đã tồn tại 1 type khác có cùng tên với tên mà ta edit cho type hiện tại
		if(typeByName != null && typeById.getTypeId() != typeByName.getTypeId()) {
			String message = "Could not update type. Type's name: " + typeName + " already exists";
			request.setAttribute("message", message);
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("message.jsp");
			
			requestDispatcher.forward(request, response);
		}
		//Edit thành công khi không trùng tên type
		else {
			//Điều chỉnh tên loại của object type theo id
			typeById.setTypeName(typeName);
			
			//Cập nhật objecy type vừa đổi tên xuống model để cập nhật qua database
			typeDAO.update(typeById);
			
			String message = "The type has been updated successfully";
			
			//Refresh lại trang bằng cách liệt kê lại danh sách các loại giày
			listType(message);
		}
	}

	//Xóa loại giày
	public void deleteType() throws ServletException, IOException {
		int typeId = Integer.parseInt(request.getParameter("id"));
		ShoeDAO shoeDAO = new ShoeDAO();
		
		//Đếm số lượng giày có trong type mà ta chuẩn bị xóa
		long numberOfShoes = shoeDAO.countByType(typeId);
		String message;
		
		//Nếu như loại giày mà ta chuẩn bị xóa có tồn tại một số đôi giày -> Không cho xóa
		if(numberOfShoes > 0) {
			message = "Could not delete type with type's id: %d, there are some shoes belong to this type";
			message = String.format(message, typeId);
		}
		
		//Không tồn tại giày trong loại giày hiện tại -> Cho phép xóa
		else {
			typeDAO.delete(typeId);
			message = "The type with id: " + typeId + " has been deleted successfully";
		}
		
		//Refresh lại trang bằng cách liệt kê lại danh sách các loại giày
		listType(message);
	}
}
