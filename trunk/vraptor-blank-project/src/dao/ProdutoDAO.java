package dao;
import java.util.List;

import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import model.*;

@Component
public class ProdutoDAO {

	
	
	@SuppressWarnings("unchecked")
	public List<Produto> listar() {
		return FabricaSessao.getSession().createCriteria(Produto.class).list();
	}
	
	public void insere(Produto p) {
		Transaction tx = FabricaSessao.getSession().beginTransaction();
		FabricaSessao.getSession().save(p);
		tx.commit();
		
	}
}
