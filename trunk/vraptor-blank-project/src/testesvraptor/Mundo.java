package testesvraptor;

import br.com.caelum.vraptor.*;
import br.com.caelum.vraptor.Resource;

@Resource
public class Mundo {

	@Path("/")
	public String boasVindas() {

		return "Ola Mundo";

	}

}
