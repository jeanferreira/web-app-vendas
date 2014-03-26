<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Boas Vindas</title>
<link rel="stylesheet" type="text/css" href="/vraptor-blank-project/WebContent/WEB-INF/_css/estilo-home.css">
<head>
	<body>
		<div id="interface">
			<form id="login"  action="principal.html">
				<fieldset id="usuario">
					<legend>Identificação de Usuário</legend>
					<p><label for="cLogin">Login:</label><input type="text" name="tLogin" id="cLogin" size="25"/></p>
					<p><label for="cSenha">Senha:</label><input type="password" name="tSenha" id="cSenha" size="25"/></p>
					<input name="btnEntrar" type="submit" value="Entrar"/>
				</fieldset>
			</form>
		</div>
	</body>
</html>