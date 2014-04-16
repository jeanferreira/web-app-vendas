package controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import model.Produto;
import dao.ProdutoDAO;

@Resource
public class ProdutosController {

	private final ProdutoDAO prodDAO;
	private final Result result;

	public ProdutosController(ProdutoDAO prodDAO, Result result) {
		this.prodDAO = prodDAO;
		this.result = result;
	}

	
	public List<Produto> buscaProduto(String nome) {
		result.include(nome);
		return prodDAO.listar(nome);
	}
	
	
	
	public void insereProduto(Produto p) {
		this.prodDAO.insere(p);
		result.redirectTo(ProdutosController.class).listaProduto();
	}
	
	public void formularioProduto() {
		
	}
	
	public void listaProduto() {
		
	}
}
