<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 1: Data e hora</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<% 
		LocalDateTime data = LocalDateTime.now();
	%>
	
	<h1>
		<%= data.getDayOfMonth() + "/" + data.getMonthValue() + "/" + data.getYear() %>
	</h1>
</body>
</html>