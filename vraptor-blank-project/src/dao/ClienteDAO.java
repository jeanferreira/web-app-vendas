package dao;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.Session;
import model.Cliente;
import br.com.caelum.vraptor.ioc.Component;


@SuppressWarnings({ "unused", "deprecation" })
@Component
public class ClienteDAO {
	
	private final FabricaSessao fabrica;
	
	public ClienteDAO(FabricaSessao fabrica) {
		this.fabrica = fabrica;
	}
	
	@SuppressWarnings("static-access")
	public void insere(Cliente c) {
		Session s = fabrica.getSession();
		Transaction tx = s.beginTransaction();
		s.save(c);
		tx.commit();
	}

}
