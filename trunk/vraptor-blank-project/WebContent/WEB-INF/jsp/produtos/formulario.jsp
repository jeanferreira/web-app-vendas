<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Produtos</title>
</head>
<body>
	<form action="insereProduto">
		<fieldset>
			<legend>Cadastro</legend>
			<p>
				<label for="cNome">Nome:<input type="text" name="produto.nome" id="cNome"/></label>
			</p>
			<p>
				<label for="cDescricao">Descrição:<textarea name="produto.descricao" id="cDescricao"></textarea></label>
			</p>
			<p>
				<label for="cPreco">Preço R$:<input type="text" name="produto.preco" id="cPreco"/></label>
			</p>
			<input type="submit" value="Cadastrar"/>
		</fieldset>
	</form>
</body>
</html>