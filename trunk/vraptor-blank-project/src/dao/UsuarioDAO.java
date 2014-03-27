package dao;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class UsuarioDAO {

	public void addUsuario() {

	}

	@SuppressWarnings({ "unused", "unchecked" })
	public boolean connect(String login, String pass) {
		boolean token = false;
		List<Usuario> lista = new ArrayList<Usuario>();
		lista = FabricaSessao.getSession().createCriteria(Usuario.class).list();

		for (Usuario u : lista) {
			if (lista.equals(login) && lista.equals(pass)) {
				;
			token = true;
			} 
		}

		return token;
	}

}
