package com.shoestore.controller.admin.rate;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shoestore.service.RateServices;


@WebServlet("/admin/edit_rate")
public class EditRateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public EditRateServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RateServices rateService = new RateServices(request, response);
		rateService.editRate();
	}

}
