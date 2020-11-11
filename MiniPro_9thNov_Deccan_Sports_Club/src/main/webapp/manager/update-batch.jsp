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
	Updating user
	<form method="post"
		action="<%=request.getContextPath()%>/ManagerController/updatebatch">
		Start BatchId:<input type="number" name="batchId" readonly="readonly" value="${batches.batchId}"> <br>
		Start Date:<input type="date" name="startDate" value="${batches.startDate}" > <br>
		End  Date:<input type="date" name="endDate"  value="${batches.endDate}"> <br>
		Batch Size:<input type="number" name="batchSize" value="${batches.batchSize}"> <br>
		Sport id:<input type="number" name="sportId" value="${batches.sportId}"> <br>
		
	 <input	type="submit" value="Update Batch">
	</form>
</body>
</html>