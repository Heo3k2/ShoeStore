<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
		<title>Managing Types</title>
		<jsp:include page="pagehead.jsp"></jsp:include>
</head>
<body>
	<jsp:directive.include file="header.jsp"/>
	<br><br><br><br>
	
	<div align="center">
		<h1>Types Management</h1>
		<hr width="70%">
		<h3><a href="type_form.jsp" class="btn btn-outline-primary btn-lg">Create new Type</a></h3>
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
		<table border="1" cellpadding="5" class="table" style="width: 800px">
			<thead class="thead-dark">
			<tr>
				<th class="align-middle justify-content-center text-center">Index</th>
				<th class="align-middle justify-content-center text-center">ID</th>
				<th class="align-middle justify-content-center text-center">Type Name</th>
				<th class="align-middle justify-content-center text-center">Actions</th>
			</tr>
			</thead>
			
			<tbody>
			<c:forEach var="type" items="${listType}" varStatus="status">
			<tr>
				<td class="align-middle justify-content-center text-center">${status.index + 1}</td>
				<td class="align-middle justify-content-center text-center">${type.typeId}</td>
				<td class="align-middle justify-content-center text-center">${type.typeName}</td>
				<td class="align-middle justify-content-center text-center">
					<a href="edit_type?id=${type.typeId}" class="btn btn-outline-primary">Edit</a>	&nbsp;
					<a href="javascript:void(0)" class="deleteLink btn btn-outline-primary" id="${type.typeId}">Delete</a> &nbsp;
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
				typeId = $(this).attr("id");
				if(confirm("Are you sure you want to delete the type with type's id: " + typeId + " ?")){
					window.location = "delete_type?id=" + typeId;
				}
			})
		});
	});
</script>

</html>