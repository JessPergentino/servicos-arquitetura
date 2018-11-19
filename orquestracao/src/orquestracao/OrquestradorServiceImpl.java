package orquestracao;

import java.net.MalformedURLException;
import java.net.URL;

import javax.jws.WebService;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.ucsal.classe.ClasseService;
import br.ucsal.ordem.OrdemService;

@WebService(endpointInterface = "orquestracao.OrquestradorService")
public class OrquestradorServiceImpl implements OrquestradorService{

	@Override
	public String buscarOrdem(String nomeCientifico) {
		
		OrdemService ordem = null;
		
		try {
			URL url = new URL("http://localhost:8088/ordem?wsdl");
			QName qname = new QName("http://ordem.ucsal.br/", "OrdemServiceImplService");
			Service ws = Service.create(url, qname);
			ordem = ws.getPort(OrdemService.class);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}		
		return ordem.buscarOrdem(nomeCientifico);
	}

	@Override
	public String buscarClasse(String nomeCientifico) {
		ClasseService classe = null;
		
		try {
			URL url = new URL("http://localhost:8889/classe?wsdl");
			QName qname = new QName("http://classe.ucsal.br/", "ClasseServiceImplService");
			Service ws = Service.create(url, qname);
			classe = ws.getPort(ClasseService.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return classe.buscarClasse(nomeCientifico);
	}

}
