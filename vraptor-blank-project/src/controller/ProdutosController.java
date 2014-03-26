package controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import model.Produto;
import dao.ProdutoDAO;

@Resource
public class ProdutosController {

	private final ProdutoDAO prodDAO;

	public ProdutosController(ProdutoDAO prodDAO) {
		this.prodDAO = prodDAO;
	}

	
	public List<Produto> lista() {
		return prodDAO.listar();
	}
	
	public void insereProduto(Produto p) {
		this.prodDAO.insere(p);
	}
	
	public void formulario() {
		
	}
}
