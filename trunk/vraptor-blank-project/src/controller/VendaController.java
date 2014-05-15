package controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class VendaController {

	private final Result result;
	private final Validator validator;
	
	public VendaController(Result result, Validator validator) {
		this.result = result;
		this.validator = validator;
		
	}
	

	public void novaVenda() {
		
	}
}
