<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Produto" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Adicionar ao carrinho</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
	
		ArrayList<Produto> produtos = (ArrayList<Produto>) session.getAttribute("produtos");
		HashMap<Produto, Integer> carrinho = (HashMap<Produto, Integer>) session.getAttribute("carrinho");
		
		for (Produto produto : produtos) {
			if (id.equals(produto.getId())) {
				if (carrinho.containsKey(produto)) {
					carrinho.put(produto, carrinho.get(produto) + 1);
				} else {
					carrinho.put(produto, 1);
				}
			}
		}
		
		session.setAttribute("carrinho", carrinho);
		
		response.sendRedirect(request.getContextPath() + "/index.jsp");
	%>
</body>
</html>