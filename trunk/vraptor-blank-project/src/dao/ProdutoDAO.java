package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.Component;
import model.*;

@SuppressWarnings({ "deprecation", "unused" })
@Component
public class ProdutoDAO {
	
	private final FabricaSessao fabrica;
	
	public ProdutoDAO(FabricaSessao fabrica) {
		this.fabrica = fabrica;		
	}

	@SuppressWarnings("unchecked")
	public List<Produto> listar() {
		return FabricaSessao.getSession().createCriteria(Produto.class).list();
	}

	@SuppressWarnings("static-access")
	public void insere(Produto p) {	
		Session s = fabrica.getSession();
		Transaction tx = s.beginTransaction();
		s.save(p);
		tx.commit();
	}
}
