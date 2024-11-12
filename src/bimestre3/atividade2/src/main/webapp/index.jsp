<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.Produto" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>E-commerce</title>
	<link rel="stylesheet" href="css/styles.css">
</head>
<body>
	<%	
		ArrayList<Produto> produtos = (ArrayList<Produto>) session.getAttribute("produtos");
	
		if (produtos == null) {
			produtos = new ArrayList<Produto>();
			
			produtos.add(new Produto("Coca-cola", "Gostoso", "https://static.paodeacucar.com/img/uploads/1/37/28314037.png", 12.5));
			produtos.add(new Produto("Doritos", "Salgados", "https://giassi.vtexassets.com/arquivos/ids/2754724/Salgadinho-de-Milho-Queijo-Nacho-Doritos-Pacote-32g.png?v=638627503488300000", 12.5));
			produtos.add(new Produto("Maçã", "Saudável", "https://images.tcdn.com.br/img/img_prod/1284052/maca_importada_kg_179_1_1865dd1e6db8af7c9f9eacc5530d665e.png", 12.5));
			produtos.add(new Produto("Pizza", "Saborosa", "https://static.paodeacucar.com/img/uploads/1/951/28039951.png", 12.5));
			produtos.add(new Produto("Suco", "Muito bom", "https://static.paodeacucar.com/img/uploads/1/328/666328.png", 12.5));
			produtos.add(new Produto("Nintendo Switch", "Muito divertido", "https://cdn.awsli.com.br/2500x2500/1781/1781384/produto/245103419/neon2-x86a7m68ej.png", 12.5));
			
			session.setAttribute("produtos", produtos);
		}
		
		HashMap<Produto, Integer> carrinho = (HashMap<Produto, Integer>) session.getAttribute("carrinho");
		
		if (carrinho == null) {
			carrinho = new HashMap<Produto, Integer>();
			session.setAttribute("carrinho", carrinho);
		}
		
		Integer itensNoCarrinho = 0;
		
		for (Produto produto : carrinho.keySet()) {
			itensNoCarrinho += 1 * carrinho.get(produto);
		}
	%>
	
	<div class="container">
		<div id="carrinho">
			<p>Carrinho: <%= itensNoCarrinho %></p>
		</div>
	
		<h1>E-commerce</h1>
	
		<h2>Lista de Produtos</h2>
		
		<form action="<%= request.getContextPath() %>/produtos/cadastro-produto.jsp">
			<button class="main-button" type="submit">Novo produto</button>
		</form>
		
		<div class="produtos">
		<% for(Produto produto : produtos) { %>
				<div class="produto">
					<h3><%= produto.getNome() %></h3>
					
					<img src="<%= produto.getImagem() %>" />
					
					<p><%= produto.getDescricao() %></p>
					<p>R$ <%= produto.getPreco() %></p>
					
					<form action="<%= request.getContextPath() %>/carrinho/adicionar-carrinho.jsp">
						<input type="hidden" name="id" value="<%= produto.getId() %>">
						<button type="submit">Adicionar ao carrinho</button>
					</form>
				</div>
		<%
			}
		%>
		</div>
		
		<form action="<%= request.getContextPath() %>/carrinho/finalizar-compra.jsp">
			<button class="main-button" type="submit">Finalizar compra</button>
		</form>
	</div>
</body>
</html>