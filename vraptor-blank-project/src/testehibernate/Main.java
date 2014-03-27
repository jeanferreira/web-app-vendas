package testehibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;



import model.Produto;
import model.Usuario;

public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Usuario u = new Usuario();
		u.setLogin("jeansf");
		u.setSenha("jean123");
		
		AnnotationConfiguration conf = new AnnotationConfiguration();
		conf.configure();
		SessionFactory f = conf.buildSessionFactory();
		Session s = f.openSession();
		
		Transaction tx = s.beginTransaction();
		s.save(u);
		tx.commit();

	}

}
