package br.ucsal.ordem;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface OrdemService {

	@WebMethod String buscarOrdem(String nomeCientifico);
	
}
