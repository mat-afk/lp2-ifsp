<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Produto" %>
<%@ page import="java.util.HashMap" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Finalizar compra</title>
	<link rel="stylesheet" href="../css/styles.css">
</head>
<body>
	<%
		HashMap<Produto, Integer> carrinho = (HashMap<Produto, Integer>) session.getAttribute("carrinho");
		
		if (carrinho == null || carrinho.size() == 0) {
			response.sendRedirect(request.getContextPath() + "/index.jsp");
		}
		
		Double total = 0.0;
		
		for(Produto produto : carrinho.keySet()) {
			total += (produto.getPreco() * carrinho.get(produto));
		}
	%>
	
	<div class="container">
	
		<h1>E-commerce</h1>
	
		<h2>Carrinho</h2>
		
		<div class="produtos">
		<% for(Produto produto : carrinho.keySet()) { %>
				<div class="produto">
					<h3><%= produto.getNome() %></h3>
					
					<img src="<%= produto.getImagem() %>" />
					
					<p><%= produto.getDescricao() %></p>
					<p>R$ <%= produto.getPreco() %></p>
					<p><%= carrinho.get(produto) %>x</p>
					
					<form action="<%= request.getContextPath() %>/carrinho/remover-carrinho.jsp">
						<input type="hidden" name="id" value="<%= produto.getId() %>">
						<button type="submit">Remover do carrinho</button>
					</form>
				</div>
		<%
			}
		%>
		</div>
		
		<h3>Total: R$ <%= total %></h3>
		
		<form action="<%= request.getContextPath() %>/index.jsp">
			<button class="main-button" type="submit">Continuar comprando</button>
		</form>
		
		<form action="<%= request.getContextPath() %>/carrinho/renovar-carrinho.jsp">
			<button class="main-button" type="submit">Finalizar compra</button>
		</form>
	</div>
</body>
</html>