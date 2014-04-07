package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Usuario;

import br.com.caelum.vraptor.ioc.Component;

@Component
public class UsuarioDAO {
	
	private final FabricaSessao fabrica;
	
	public UsuarioDAO(FabricaSessao fabrica) {
		this.fabrica = fabrica;		
	}

	@SuppressWarnings("static-access")
	public void addUsuario(Usuario u) {
		Session s = fabrica.getSession();
		Transaction tx = s.beginTransaction();
		s.save(u);
		tx.commit();
	}

	
	@SuppressWarnings({ "unchecked", "static-access" })
	public boolean connect(Usuario u) {
		boolean token = false;
		List<Usuario> lista = new ArrayList<Usuario>();
		lista = fabrica.getSession().createCriteria(Usuario.class).list();

		for(int i = 0; i<lista.size(); i++){
			if(lista.get(i).getLogin().equals(u.getLogin()) && 
					lista.get(i).getSenha().equals(u.getSenha())) {
				token = true;
			}
		}
		return token;
	}

}
