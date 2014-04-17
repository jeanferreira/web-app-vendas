<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="../estiloprincipal.css">
<link rel="stylesheet" type="text/css" href="../formulario.css">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
<script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery.validate/1.8/jquery.validate.min.js"></script>
<script language="javascript" src="../funcoes.js"></script>
<title>Softex-Produto</title>
</head>
<body>
	<div id="conteudo">
		<header id="cabecalho">
			<img id="icone" src="../icone-peq.png">
			<hgroup>
				<h1>Softex</h1>
				<h2>Orange</h2>
				<h6><span>Usuário:</span></h6>
				<h6>${usuarioDAO.user.login}</h6>
			</hgroup>
			<nav id="menu-principal">
  				<ul class="menu">
  					<li onmouseover="mudaFoto('../home.png')" onmouseout="mudaFoto('../icone-peq.png')"><a href="../principal/boasVindas">Home</a></li>
  					<li onmouseover="mudaFoto('../clientes.png')" onmouseout="mudaFoto('../icone-peq.png')"><a href="#">Clientes</a>
  						<ul class="sub-menu">
  							<span><li><a href="../cliente/formularioCliente">Cadastrar</a></li></span>
  							<span><li><a href="../cliente/listaCliente">Listar</a></li></span>
  							<span><li><a href="../cliente/alteraCliente">Alterar</a></li></span>
  							<span><li><a href="#">Remover</a></li></span>
  						</ul>
  					</li>
  					<li onmouseover="mudaFoto('../produto.png')" onmouseout="mudaFoto('../icone-peq.png')"><a href="#">Produtos</a>
  						<ul class="sub-menu">
  							<span><li><a href="../produtos/formularioProduto">Cadastrar</a></li></span>
  							<span><li><a href="../produtos/listaProduto">Listar</a></li></span>
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
				<form id="form-produto" method="post" action="insereProduto" onclick="validaProduto();">
					<fieldset>
						<legend>Cadastro de Produtos</legend>
						<p><label for="cNome">Nome:<input type="text" name="p.nome" id="cNome" class="required" minlength="3"/></label></p>
						<p><label for="cDescricao">Descrição:<textarea name="p.descricao" id="cDescricao" class="required" maxlength="40"></textarea></label></p>
						<p><label for="cPreco">Preço R$:<input type="text" name="p.preco" id="cPreco" class="required" min="0"/></label></p>
						
						<button type="submit">Cadastrar</button>
						
					</fieldset>
				</form>
			</div>
			
		</div>
	</div>
</body>
</html>