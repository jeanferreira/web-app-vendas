<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Bem Vindo</title>
	<link rel="stylesheet" type="text/css" href="../estilo.css">
	
</head>
<body>
	<div id="interface">
		<header id="cabecalho">
			<div id="erros">
				<ul>
					<c:forEach items="${errors}" var="error">
						<li>${error.category } - ${error.message }</li>
					</c:forEach>
				</ul>
			</div>
		</header>
		<div id="corpo">
			<form id="login" method="post"  action="cadUser">
				<fieldset id="usuario">
					<legend>Identifica��o de Usu�rio</legend>
					<p><label for="cLogin">Login:</label><input type="text" name="u.login" id="cLogin" size="25"/></p>
					<p><label for="cSenha">Senha:</label><input type="password" name="u.senha" id="cSenha" size="25"/></p>
					<button type="submit">Cadastrar</button>
				</fieldset>
			</form>
		</div>
	</div>
</body>
</html>