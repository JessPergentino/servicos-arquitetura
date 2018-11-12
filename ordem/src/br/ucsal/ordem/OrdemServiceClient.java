package br.ucsal.ordem;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class OrdemServiceClient {
	public static void main(String args[]) throws Exception {
		URL url = new URL("http://localhost:8888/ordem?wsdl");
		QName qname = new QName("http://ordem.ucsal.br/", "OrdemServiceImplService");
		Service ws = Service.create(url, qname);
		OrdemService ordem = ws.getPort(OrdemService.class);

		for (int i = 0; i <5; i++) {
			String nome = "nome" + i;
			System.out.println("Ordem Animal " + i + " " + ordem.buscarOrdem(nome));
		}
	}
}
