package orquestracao;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class OrquestradorClient {

	public static void main(String args[]) {
		URL url = null;
		try {
			url = new URL("http://localhost:8090/orquestracao?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		QName qname = new QName("http://orquestracao/", "OrquestradorServiceImplService");
		Service ws = Service.create(url, qname);
		OrquestradorService orquestrador = ws.getPort(OrquestradorService.class);

		for (int i = 0; i < 5; i++) {
			String nome = "nome" + i;
			System.out.println("Ordem Animal " + i + " " + orquestrador.buscarOrdem(nome));
		}

		for (int i = 0; i < 5; i++) {
			String nome = "nome" + i;
			System.out.println("Classe Animal " + i + " " + orquestrador.buscarClasse(nome));
		}
	}
}
