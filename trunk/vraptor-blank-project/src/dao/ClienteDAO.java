package dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Session;

import sun.misc.Cleaner;

import com.sun.org.apache.regexp.internal.recompile;

import model.Cliente;
import br.com.caelum.vraptor.ioc.Component;


@SuppressWarnings({ "unused", "deprecation" })
@Component
public class ClienteDAO {
	
	private final FabricaSessao fabrica;
	private List<Cliente> lista;
	
	public ClienteDAO(FabricaSessao fabrica, List<Cliente> lista) {
		this.fabrica = fabrica;
		this.lista = lista;
		
	}
	
	@SuppressWarnings("static-access")
	public void insere(Cliente c) {
		Session s = fabrica.getSession();
		Transaction tx = s.beginTransaction();
		s.save(c);
		tx.commit();
	}
	
	@SuppressWarnings({ "static-access", "unchecked" })
	public List<Cliente> lista(String nome) {
		Criteria crit = fabrica.getSession().createCriteria(Cliente.class);
		crit.add(Restrictions.ilike(nome, MatchMode.ANYWHERE));
		lista = crit.list();
		
		return lista;
	}

}
