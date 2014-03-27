package controller;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class PrincipalController {

	@SuppressWarnings("unused")
	private final Result result;
	
	public PrincipalController(Result result) {
		this.result = result;
	}
	
	public void boasVindas() {
		
	}
}
