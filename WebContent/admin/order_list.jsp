<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
		<title>Managing Orders</title>
		<jsp:include page="pagehead.jsp"></jsp:include>
</head>
<body>
	<jsp:directive.include file="header.jsp"/>
	<br><br><br><br>
	
	<div align="center">
		<h1>Orders Management</h1>
		<hr width="70%">	
	</div>
	
	<br>
	
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
	
	<br>	
		
	<div align="center">
		<table border="1" cellpadding="5" style="text-align: center; width: 1300px" class="table">
			<thead class="thead-dark">
			<tr>
				<th class="align-middle justify-content-center text-center">Index</th>
				<th class="align-middle justify-content-center text-center">Order's ID</th>
				<th class="align-middle justify-content-center text-center">Ordered by</th>
				<th class="align-middle justify-content-center text-center">Pair(s) of shoes</th>
				<th class="align-middle justify-content-center text-center">Total</th>
				<th class="align-middle justify-content-center text-center">Payment Method</th>
				<th class="align-middle justify-content-center text-center">Status</th>
				<th class="align-middle justify-content-center text-center">Order Date</th>
				<th class="align-middle justify-content-center text-center">Actions</th>
			</tr>
			</thead>
			
			<tbody>
			<c:forEach var="order" items="${listOrder}" varStatus="status">
			<tr>
				<td class="align-middle justify-content-center text-center">${status.index + 1}</td>
				<td class="align-middle justify-content-center text-center">${order.orderId}</td>
				<td class="align-middle justify-content-center text-center">${order.customer.fullName}</td>
				<td class="align-middle justify-content-center text-center">${order.pairOfShoes}</td>
				<td class="align-middle justify-content-center text-center">$${order.orderSum}</td>
				<td class="align-middle justify-content-center text-center">${order.payment}</td>
				<td class="align-middle justify-content-center text-center">
		            <c:choose>
		                <c:when test="${order.status == 'Processing'}">
		                    <span class="badge bg-warning text-dark">${order.status}</span>
		                </c:when>
		                <c:when test="${order.status == 'Shipping'}">
		                    <span class="badge bg-info text-dark">${order.status}</span>
		                </c:when>
		                <c:when test="${order.status == 'Delivered'}">
		                    <span class="badge bg-primary">${order.status}</span>
		                </c:when>
		                <c:when test="${order.status == 'Completed'}">
		                    <span class="badge bg-success">${order.status}</span>
		                </c:when>
		                <c:when test="${order.status == 'Cancelled'}">
		                    <span class="badge bg-danger">${order.status}</span>
		                </c:when>
		                <c:otherwise>
		                    <span class="badge bg-secondary">${order.status}</span>
		                </c:otherwise>
		            </c:choose>
        		</td>				
        		<td class="align-middle justify-content-center text-center">${order.orderDate}</td>
				
				<td class="align-middle justify-content-center text-center">
					<a href="view_order?orderId=${order.orderId}" class="btn btn-outline-primary">Details</a>	&nbsp;
					<a href="edit_order?orderId=${order.orderId}" class="btn btn-outline-primary">Edit</a>	&nbsp;
					<a href="javascript:void(0)" class="deleteLink btn btn-outline-primary" id="${order.orderId}">Delete</a> &nbsp;
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
				orderId = $(this).attr("id");
				if(confirm("Are you sure you want to delete the order with order's id: " + orderId + " ?")){
					window.location = "delete_order?orderId=" + orderId;
				}
			})
		});
	});
</script>

</html>