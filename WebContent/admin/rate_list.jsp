<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
		<title>Managing Rates</title>
		<jsp:include page="pagehead.jsp"></jsp:include>
</head>
<body>
	<jsp:directive.include file="header.jsp"/>
	<br><br><br><br>
	
	<div align="center">
		<h1>Lists Management</h1>
		<hr width="70%">	
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
		<table border="1" cellpadding="5" style="text-align: center; width: 1400px" class="table">
			<thead class="thead-dark">
			<tr>
				<th class="align-middle justify-content-center text-center">Index</th>
				<th class="align-middle justify-content-center text-center">ID</th>
				<th class="align-middle justify-content-center text-center">Shoes' name</th>
				<th class="align-middle justify-content-center text-center">Rating stars</th>
				<th class="align-middle justify-content-center text-center">Headline's rate</th>
				<th class="align-middle justify-content-center text-center">Customer's full name</th>
				<th class="align-middle justify-content-center text-center">Review date</th>
				<th class="align-middle justify-content-center text-center">Actions</th>
			</tr>
			</thead>
			
			<tbody>
			<c:forEach var="rate" items="${listRate}" varStatus="status">
			<tr>
				<td class="align-middle justify-content-center text-center">${status.index + 1}</td>
				<td class="align-middle justify-content-center text-center">${rate.rateId}</td>
				<td class="align-middle justify-content-center text-center">${rate.shoe.shoeName}</td>
				<td class="align-middle justify-content-center text-center">
					<c:forEach begin="1" end="5" var="i">
	                <c:choose>
	                    	<c:when test="${i <= rate.ratingStars}">
	                        	<i class="bi bi-star-fill"></i>
	                    	</c:when>
	                    	<c:otherwise>
	                        	<i class="bi bi-star"></i>
	                    	</c:otherwise>
	                	</c:choose>
	           		</c:forEach>
            	</td>
				<td class="align-middle justify-content-center text-center">${rate.headline}</td>
				<td class="align-middle justify-content-center text-center">${rate.customer.fullName}</td>
				<td class="align-middle justify-content-center text-center">${rate.rateTime}</td>
				<td class="align-middle justify-content-center text-center">
					<a href="edit_rate?id=${rate.rateId}" class="btn btn-outline-primary">Edit</a>	&nbsp;
					<a href="javascript:void(0)" class="deleteLink btn btn-outline-primary" id="${rate.rateId}">Delete</a> &nbsp;
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
				rateId = $(this).attr("id");
				if(confirm("Are you sure you want to delete the rate with rate's id: " + rateId + " ?")){
					window.location = "delete_rate?id=" + rateId;
				}
			})
		});
	});
</script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</html>