package testehibernate;

import org.hibernate.Transaction;

import model.Produto;
import dao.FabricaSessao;

public class Main {

	public static void main(String[] args) {
		Produto p = new Produto();
		
		p.setNome("Achocolatado");
		p.setDescricao("Achocolatado Nescau 500g");
		p.setPreco(5.29);
		
		Transaction tx = FabricaSessao.getSession().beginTransaction();
		FabricaSessao.getSession().save(p);
		tx.commit();

	}

}
