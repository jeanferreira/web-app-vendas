package interceptors;


import controller.UsuarioController;
import dao.UsuarioDAO;
import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.resource.ResourceMethod;

public class AutorizacaoInterceptor implements Interceptor{
	
	private final UsuarioDAO usDAO;
	private final Result result;
	
	public AutorizacaoInterceptor(UsuarioDAO usDAO, Result result) {
		this.usDAO = usDAO;		
		this.result = result;
	}
	

	public boolean accepts(ResourceMethod method) {
		return !this.usDAO.isLogged();
	}

	public void intercept(InterceptorStack stack, ResourceMethod method,
			Object resourceInstance) throws InterceptionException {
		result.redirectTo(UsuarioController.class).login();
		
	}
}
