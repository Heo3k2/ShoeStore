package com.shoestore.controller.frontend.order;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.paypal.api.payments.PayerInfo;
import com.paypal.api.payments.Payment;
import com.paypal.api.payments.ShippingAddress;
import com.paypal.api.payments.Transaction;
import com.paypal.base.rest.PayPalRESTException;
import com.shoestore.service.OrderServices;
import com.shoestore.service.PaymentServices;


@WebServlet("/execute_payment")
public class ExecutePaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ExecutePaymentServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PaymentServices paymentService = new PaymentServices(request, response);
		try {
			Payment payment = paymentService.executePayment();
			
			OrderServices orderService = new OrderServices(request, response);
			Integer orderId = orderService.placeOrderPaypal(payment);
			
			HttpSession session = request.getSession();
			session.setAttribute("orderId", orderId);
			
			PayerInfo payerInfo = payment.getPayer().getPayerInfo();
			Transaction transaction = payment.getTransactions().get(0);
			
			
			session.setAttribute("payer", payerInfo);
			session.setAttribute("transaction", transaction);
			
			String reviewPage = "frontend/payment_receipt.jsp";
			request.getRequestDispatcher(reviewPage).forward(request, response);
		} catch (PayPalRESTException e) {
			e.printStackTrace();
			throw new ServletException("Error in executing payment.");
		}
	}

}
