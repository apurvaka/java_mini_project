<%@page import="com.cybage.pojos.Plans"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- logic for rendering list...  -->
	
	<a href="<%=request.getContextPath()%>/manager/add-plan.jsp">add plan</a>
	<table border="1">
		<tr>
			<th>Plan Id</th>
			<th>Plan Name</th>
			<th>Fees</th>
			<th>Duration</th>
			
			
			
		</tr>
		<c:forEach var="plans" items="${plans}">
			<tr>
			<!-- user.getUsername(); user.getUserrole() -->
			<td><c:out value="${plans.planId}"></c:out></td>  
			<td><c:out value="${plans.planName}"></c:out></td>
			<td><c:out value="${plans.fees}"></c:out></td>  
			<td><c:out value="${plans.duration}"></c:out></td>
			
			
			
			<td>
			<a href="<%=request.getContextPath()%>/ManagerController/deleteplan?planId=${plans.planId}">delete</a>
			</td>
			<td>
			<a href="<%=request.getContextPath()%>/ManagerController/editplan?planId=${plans.planId}">update</a>
			</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>