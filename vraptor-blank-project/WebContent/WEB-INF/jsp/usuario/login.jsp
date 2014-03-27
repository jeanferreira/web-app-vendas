<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="pt-br">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Bem Vindo</title>
	<link rel="stylesheet"type="text/css" href="">
</head>
<body>
	<div id="interface">
		<form id="login"  action="connect">
			<fieldset id="usuario">
				<legend>Identificação de Usuário</legend>
				<p><label for="cLogin">Login:</label><input type="text" name="login" id="cLogin" size="25"/></p>
				<p><label for="cSenha">Senha:</label><input type="password" name="pass" id="cSenha" size="25"/></p>
				<input name="btnEntrar" type="submit" value="Entrar"/>
			</fieldset>
		</form>
	</div>
</body>
</html>