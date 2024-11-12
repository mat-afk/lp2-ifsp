<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastro de produtos</title>
	<link rel="stylesheet" href="../css/styles.css">
</head>
<body>
	<div class="container">
		<h1>Cadastro de produtos</h1>
	
		<form id="cadastro-produto" action="<%= request.getContextPath() %>/produtos/cadastrar-produto.jsp" method="GET">
			<div class="form-control">
				<label for="nome">Nome</label>
				<input type="text" name="nome" />
			</div>
			
			<div class="form-control">
				<label for="descricao">Descrição</label>
				<input type="text" name="descricao" />
			</div>
			
			<div class="form-control">
				<label for="preco">Preço</label>
				<input type="text" name="preco" />
			</div>
			
			<div class="form-control">
				<label for="imagem">Imagem</label>
				<input type="text" name="imagem" />
			</div>
			
			<button class="main-button" type="submit">Cadastrar</button>
		</form>
		
		<form action="<%= request.getContextPath() %>/index.jsp">
			<button class="main-button" type="submit">Voltar</button>
		</form>
	</div>
</body>
</html>