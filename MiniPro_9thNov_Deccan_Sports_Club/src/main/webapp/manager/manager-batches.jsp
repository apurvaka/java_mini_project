<%@page import="com.cybage.pojos.AllBatchInfo"%>
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
	
	<a href="<%=request.getContextPath()%>/manager/add-batch.jsp">add users</a>
	<table border="1">
		<tr>
			<th>BatchId</th>
			<th>Start Date</th>
			<th>End Date</th>
			<th>Batch Size</th>
			<th>Sport Name</th>
			<th>SportId</th>
			
			
		</tr>
		<c:forEach var="batch" items="${batches }">
			<tr>
			<!-- user.getUsername(); user.getUserrole() -->
			<td><c:out value="${batch.batchId}"></c:out></td>  
			<td><c:out value="${batch.startDate}"></c:out></td>
			<td><c:out value="${batch.endDate}"></c:out></td>  
			<td><c:out value="${batch.batchSize}"></c:out></td>
			<td><c:out value="${batch.sportId}"></c:out></td>  
			<td><c:out value="${batch.sportName}"></c:out></td>
			
			
			<td>
			<a href="<%=request.getContextPath()%>/ManagerController/deletebatch?batchId=${batch.batchId}">delete</a>
			</td>
			<td>
			<a href="<%=request.getContextPath()%>/ManagerController/editbatch?batchId=${batch.batchId}">update</a>
			</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>