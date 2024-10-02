<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exercício 2: Tabuada</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
</head>
<body>
	<% for (int i = 1; i < 10; i++) { %>
		<div class="tabuada">
			<h2>Tabuada do <%= i %></h2>
			<table>
				<thead>
					<tr>
						<th>#</th>
						<th>#</th>
						<th>#</th>
						<th>#</th>
						<th>#</th>
					</tr>
				</thead>
				<tbody>
					<% for (int j = 1; j <= 10; j++) { %>
						<tr>
							<td><%= i %></td>
							<td>X</td>
							<td><%= j %></td>
							<td>=</td>
							<td><%= i * j %></td>
						</tr>
					<% } %>
				</tbody>
			</table>
		</div>
	<% } %>
</body>
</html>