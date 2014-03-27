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
	public boolean connect(Usuario u) {
		boolean token = false;
		List<Usuario> lista = new ArrayList<Usuario>();
		lista = FabricaSessao.getSession().createCriteria(Usuario.class).list();

		for(int i = 0; i<lista.size(); i++){
			if(lista.get(i).getLogin().equals(u.getLogin()) && 
					lista.get(i).getSenha().equals(u.getSenha())) {
				token = true;
			}
		}
		return token;
	}

}
