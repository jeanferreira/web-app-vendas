package testehibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



import model.Produto;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Produto p = new Produto();
		
		p.setNome("Achocolatado");
		p.setDescricao("Achocolatado Nescau 500g");
		p.setPreco(5.29);
		
		AnnotationConfiguration conf = new AnnotationConfiguration();
		conf.configure();
		SessionFactory f = conf.buildSessionFactory();
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		s.save(p);
		tx.commit();

	}

}
