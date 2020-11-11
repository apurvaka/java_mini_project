<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
welcome <%= request.getRemoteUser() %>
<br>
Manager role or not? <%=request.isUserInRole("manager") %>
<br>
<a href="<%=request.getContextPath()%>/ManagerController/listbatch">User management</a>
<br>
<a href="<%=request.getContextPath()%>/ManagerController/listplan">List of plans</a>
<br>
<a href="<%=request.getContextPath()%>/logout.jsp">Logout</a>
</body>
</html>