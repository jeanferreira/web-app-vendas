<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../estiloprincipal.css">
<link rel="stylesheet" type="text/css" href="../formulario.css">
<script language="javascript" src="../funcoes.js"></script>
<title>Cliente</title>
</head>
<body>
	<div id="conteudo">
		<header id="cabecalho">
			<img id="icone" src="../icone-peq.png">
			<hgroup>
				<h1>Softex</h1>
				<h2>Orange</h2>
			</hgroup>
			<nav id="menu-principal">
  				<ul class="menu">
  					<li onmouseover="mudaFoto('../home.png')" onmouseout="mudaFoto('../icone-peq.png')"><a href="../principal/boasVindas">Home</a></li>
  					<li onmouseover="mudaFoto('../clientes.png')" onmouseout="mudaFoto('../icone-peq.png')"><a href="#">Clientes</a>
  						<ul class="sub-menu">
  							<span><li><a href="#">Cadastrar</a></li></span>
  							<span><li><a href="#">Listar</a></li></span>
  							<span><li><a href="#">Alterar</a></li></span>
  							<span><li><a href="#">Remover</a></li></span>
  						</ul>
  					</li>
  					<li onmouseover="mudaFoto('../produto.png')" onmouseout="mudaFoto('../icone-peq.png')"><a href="#">Produtos</a>
  						<ul class="sub-menu">
  							<span><li><a href="../produtos/formularioProduto">Cadastrar</a></li></span>
  							<span><li><a href="#">Listar</a></li></span>
  							<span><li><a href="#">Alterar</a></li></span>
  							<span><li><a href="#">Remover</a></li></span>
  						</ul>
  					</li>
  					<li onmouseover="mudaFoto('../venda.png')" onmouseout="mudaFoto('../icone-peq.png')"><a href="#">Venda</a>
  						<ul class="sub-menu">
  							<span><li><a href="#">Nova Venda</a></li></span>
  							<span><li><a href="#">Pesquisar</a></li></span>
  						</ul>
  					</li>
  						
  					<li onmouseover="mudaFoto('../sair.png')" onmouseout="mudaFoto('../icone-peq.png')"><span><a href="../usuario/sair">Sair</a></span></li>
				</ul>
			</nav>
		</header>
		<div id="corpo">
			<div id="conteudo-corpo">
				<form method="post" action="insereCliente">
					<fieldset id="infcliente">
						<legend>Informações do Cliente</legend>
						<p><label for="cNome">Nome:<input type="text" name="c.nome" id="cNome" size="60" maxlength="60"/></label></p>
						<p><label for="cCpf">Cpf:<input type="text" name="c.cpf" id="cCpf"/></label></p>
						<p><label for="cEmail">E-mail:<input type="email" name="c.email" id="cEmail" /></label></p>
						<p><label for="cTelefone">Telefone:<input type="text" name="c.telefone" id="cTelefone"/></label>
						<p><label for="cEndereco">Endereço:<input type="text" name="c.endereco" id="cEndereco"/></label></p>
						
						<button type="submit">Cadastrar</button>
					</fieldset>
				</form>
			</div>
			
		</div>
	</div>
</body>
</html>