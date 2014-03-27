package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.Component;
import model.*;

@SuppressWarnings("deprecation")
@Component
public class ProdutoDAO {

	@SuppressWarnings("unchecked")
	public List<Produto> listar() {
		return FabricaSessao.getSession().createCriteria(Produto.class).list();
	}

	public void insere(Produto p) {
		AnnotationConfiguration conf = new AnnotationConfiguration();
		conf.configure();
		SessionFactory f = conf.buildSessionFactory();
		Session s = f.openSession();

		Transaction tx = s.beginTransaction();
		s.save(p);
		tx.commit();

	}
}
