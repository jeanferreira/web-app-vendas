package controller;

import model.Usuario;
import dao.UsuarioDAO;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.caelum.vraptor.view.Results;

@Resource
public class UsuarioController {

	private final UsuarioDAO usDAO;
	private final Result result;
	private final Validator validator;

	public UsuarioController(UsuarioDAO usDAO, Result result,
			Validator validator) {
		this.usDAO = usDAO;
		this.result = result;
		this.validator = validator;
	}

	public void logar(Usuario u) {
		if (u.getLogin() == null || u.getSenha() == null) {
			validator.add(new ValidationMessage("Erro-",
					"Login e/ou Senha não podem ser vazios!"));
			validator.onErrorUsePageOf(PrincipalController.class).error();
		} else {
			if (usDAO.connect(u)) {
				result.use(Results.logic())
						.forwardTo(PrincipalController.class).boasVindas();
			} else {
				result.redirectTo(PrincipalController.class).error();
			}
		}
	}

	public void sair() {
		result.redirectTo(UsuarioController.class).login();
	}

	@Path("/")
	public void login() {

	}

	public void formularioUsuario() {

	}

	public void cadUser(Usuario u) {
		if (u.getLogin() == null || u.getSenha() == null) {
			validator.add(new ValidationMessage("Erro-",
					"Usuário e/ou Senha Não Podem Ser Vazios!"));
			validator.onErrorUsePageOf(UsuarioController.class)
					.formularioUsuario();
		} else {
			usDAO.addUsuario(u);
			result.redirectTo(UsuarioController.class).login();

		}

	}
}
