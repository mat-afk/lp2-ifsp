<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Produto" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastrar</title>
</head>
<body>
	<%
		String nome = request.getParameter("nome");
		String descricao = request.getParameter("descricao");
		Double preco = Double.parseDouble(request.getParameter("preco"));
		String imagem = request.getParameter("imagem");
		
		ArrayList<Produto> produtos = (ArrayList<Produto>) session.getAttribute("produtos");
		
		if (produtos == null){
			produtos = new ArrayList<Produto>();
		}
		
		produtos.add(new Produto(nome, descricao, imagem, preco));
		
		session.setAttribute("produtos", produtos);
		
		response.sendRedirect(request.getContextPath() + "/index.jsp");
	%>
</body>
</html>