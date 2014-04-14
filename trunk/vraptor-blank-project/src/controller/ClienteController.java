package controller;

import java.util.List;

import model.Cliente;
import dao.ClienteDAO;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;


@Resource
public class ClienteController {
	
	private final ClienteDAO cDAO;
	private final Result result;
	
	public ClienteController(ClienteDAO cDAO, Result result) {
		this.cDAO = cDAO;
		this.result = result;
	}
	
	public void insereCliente(Cliente c) {
		this.cDAO.insere(c);
		this.result.redirectTo(PrincipalController.class).boasVindas();
	}
	
	public List<Cliente> busca(String nome) {
		result.include("nome",nome);
		return cDAO.lista(nome);
	}
	
	public void formularioCliente() {
		
	}
	
	public void lista() {
		
	}
	
}
