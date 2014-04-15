package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import model.*;

@SuppressWarnings({ "deprecation", "unused" })
@Component
public class ProdutoDAO {

	private final FabricaSessao fabrica;
	private List<Produto> lista;

	public ProdutoDAO(FabricaSessao fabrica, List<Produto> lista) {
		this.fabrica = fabrica;
		this.lista = lista;
	}

	@SuppressWarnings({ "unchecked", "static-access" })
	public List<Produto> listar(String pnome) {
		lista = new ArrayList<Produto>();
		lista = fabrica.getSession().createCriteria(Produto.class)
				.add(Restrictions.ilike("nome", pnome, MatchMode.ANYWHERE))
				.list();
		if(lista.isEmpty()) {
			listaTudo();
		}
		
		return lista;

	}
	
	@SuppressWarnings({ "unchecked", "static-access" })
	public List<Produto> listaTudo() {
		lista = new ArrayList<Produto>();
		lista = fabrica.getSession().createCriteria(Produto.class).list();
		return lista;
	}

	@SuppressWarnings("static-access")
	public void insere(Produto p) {
		Session s = fabrica.getSession();
		Transaction tx = s.beginTransaction();
		s.save(p);
		tx.commit();
	}
}
