 function mudaFoto(foto) {
        document.getElementById("icone").src=foto;
    }
 
 function validaProduto() {
	 $('#form-produto').validate({
		 rules: {
			 "p.nome": {
			 required: true,
			 minlength: 3
			 },
			 "p.descricao": {
			 required: true,
			 maxlength: 40
			 },
			 "p.preco": {
			 min: 0.0
			 }
			 }
			 });

 }