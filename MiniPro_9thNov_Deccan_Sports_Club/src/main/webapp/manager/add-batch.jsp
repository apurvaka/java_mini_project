<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Adding new user
	<form method="post"
		action="<%=request.getContextPath()%>/ManagerController/addbatch">
		Start Date:<input type="date" name="startDate"> <br>
		End  Date:<input type="date" name="endDate"> <br>
		Batch Size:<input type="number" name="batchSize"> <br>
		Sport id:<input type="number" name="sportId"> <br>
		
		 <input type="submit" value="Add Batch">
	</form>
</body>
</html>