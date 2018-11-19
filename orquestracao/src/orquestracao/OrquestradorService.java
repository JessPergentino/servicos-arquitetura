package orquestracao;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface OrquestradorService {

	@WebMethod String buscarClasse(String nomeCientifico);
	@WebMethod String buscarOrdem(String nomeCientifico);

}
