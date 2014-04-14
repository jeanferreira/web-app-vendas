<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="lista.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clientes</title>
</head>
<body>
	<table border="1" style="width:300px" id="cliente">
							<thead>
								<tr>
									<th>Cod</th>
									<th>Nome</th>
									<th>Cpf</th>
									<th>Email</th>
									<th>Telefone</th>
									<th>Endereço</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${clienteList}" var="cliente">
									<tr>
										<td>${cliente.id}</td>
										<td>${cliente.nome}</td>
										<td>${cliente.cpf}</td>
										<td>${cliente.email}</td>
										<td>${cliente.telefone}</td>
										<td>${cliente.endereco}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
</body>
</html>