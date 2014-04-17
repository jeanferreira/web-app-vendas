function mudaFoto(foto) {
	document.getElementById("icone").src = foto;
}

function validaProduto() {
	$('#form-produto').validate({
		rules : {
			"p.nome" : {
				required : true,
				minlength : 3
			},
			"p.descricao" : {
				required : true,
				maxlength : 40
			},
			"p.preco" : {
				min : 0.0
			}
		}
	});

}

function validaCliente() {
	$('#form-cliente').validate({
		rules : {
			"c.nome" : {
				required : true,
				minlength : 3
			},
			"c.cpf" : {
				required : true,
				maxlength : 40
			},
		}
	});

}

function validaUsuario() {
	if ($.get("UsarioController.connect") == true) {
		alert("Entrou");
	} else {
		alert("Login e/ou Senha Incorretos!");
	}
}