<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
		<jsp:include page="pagehead.jsp"></jsp:include>
</head>
<body>
	<jsp:directive.include file="header.jsp"/>
	<br><br><br><br>
	
	<div align="center">
		<h1>Shoes Management</h1>
		<hr width="70%">
		<h3><a href="new_shoe" class="btn btn-outline-primary">Create new Shoes</a></h3>
	</div>
	
	<c:if test="${message != null}">
	    <c:choose>
	        <c:when test="${message.contains('successfully')}">
	            <div align="center" class="alert alert-info" role="alert">
	                <h4>${message}</h4>
	            </div>
	        </c:when>
	        <c:otherwise>
	            <div align="center" class="alert alert-danger" role="alert">
	                <h4>${message}</h4>
	            </div>
	        </c:otherwise>
	    </c:choose>
	</c:if>
		
	<div align="center">
		<table border="1" cellpadding="5" class="table" style="width: 1200px">
			<thead class="thead-dark">
			<tr>
				<th class="align-middle justify-content-center text-center">Index</th>
				<th class="align-middle justify-content-center text-center">ID</th>
				<th class="align-middle justify-content-center text-center">Image</th>
				<th class="align-middle justify-content-center text-center">Shoes' name</th>
				<th class="align-middle justify-content-center text-center">Brand</th>
				<th class="align-middle justify-content-center text-center">Type of shoes</th>
				<th class="align-middle justify-content-center text-center">Price</th>
				<th class="align-middle justify-content-center text-center">Released date</th>
				<th class="align-middle justify-content-center text-center">Actions</th>
			</tr>
			</thead>
			
			<tbody>
			<c:forEach var="shoe" items="${listShoes}" varStatus="status">
			<tr>
				<td class="align-middle justify-content-center text-center">${status.index + 1}</td>
				<td class="align-middle justify-content-center text-center">${shoe.shoeId}</td>
				
				<td>
					<img src="data:image/jpg;base64,${shoe.base64Image}" width="250" height="240"/>
				</td>
				
				<td class="align-middle justify-content-center text-center">${shoe.shoeName}</td>
				<td class="align-middle justify-content-center text-center">${shoe.brand}</td>
				<td class="align-middle justify-content-center text-center">${shoe.type.typeName}</td>
				<td class="align-middle justify-content-center text-center">$${shoe.shoePrice}</td>
				<td class="align-middle justify-content-center text-center"><f:formatDate pattern='dd/MM/yyyy' value='${shoe.releasedDate}'/></td>
				
				<td class="align-middle justify-content-center text-center">
					<a href="edit_shoe?id=${shoe.shoeId}" class="btn btn-outline-primary">Edit</a>	&nbsp;
					<a href="javascript:void(0)" class="deleteLink btn btn-outline-primary" id="${shoe.shoeId}">Delete</a> &nbsp;
				</td>
			</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
	
	
	<br><br><br><br>
	<jsp:directive.include file="footer.jsp"/>
</body>
<script>
	$(document).ready(function(){
		$(".deleteLink").each(function(){
			$(this).on("click", function(){
				shoeId = $(this).attr("id");
				if(confirm("Are you sure you want to delete the shoe with shoe's id: " + shoeId + " ?")){
					window.location = "delete_shoe?id=" + shoeId;
				}
			})
		});
	});
</script>

</html>