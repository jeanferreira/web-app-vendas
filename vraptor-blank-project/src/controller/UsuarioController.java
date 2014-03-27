package controller;

import dao.UsuarioDAO;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Resource
public class UsuarioController {

	private final UsuarioDAO usDAO;
	private final Result result;
	
	public UsuarioController(UsuarioDAO usDAO, Result result) {
		this.usDAO = usDAO;
		this.result = result;
	}
	
	
	public void connect(String login, String pass) {
		usDAO.connect(login, pass);
		result.use(Results.logic()).forwardTo(PrincipalController.class).boasVindas();
	}
	
	@Path("/")
	public void login() {
		
	}
}
