<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Bem Vindo</title>
	<link rel="stylesheet" type="text/css" href="estilo.css">
	
</head>
<body>
	<div id="interface">
		<header id="cabecalho">
			<h5><a href="usuario/formularioUsuario">Ainda n�o � Cadastrado?</a></h5>		
		</header>
		<div id="corpo">
			<form id="login" method="post"  action="usuario/logar" onclick="validaUsuario();">
				<fieldset id="usuario">
					<legend>Identifica��o de Usu�rio</legend>
					<p><label for="cLogin">Login:</label><input type="text" name="u.login" id="cLogin" size="25"/></p>
					<p><label for="cSenha">Senha:</label><input type="password" name="u.senha" id="cSenha" size="25"/></p>
					<button type="submit">Entrar</button>
				</fieldset>
			</form>
		</div>
	</div>
</body>
</html>