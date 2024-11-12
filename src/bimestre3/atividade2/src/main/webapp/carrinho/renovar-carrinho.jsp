<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Renovar carrinho</title>
</head>
<body>
	<%
		session.setAttribute("carrinho", null);
		
		response.sendRedirect(request.getContextPath() + "/index.jsp");
	%>
</body>
</html>