package br.ucsal.classe;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class ClasseServiceClient {
	public static void main(String args[]) throws Exception {
		URL url = new URL("http://localhost:8889/classe?wsdl");
		QName qname = new QName("http://classe.ucsal.br/", "ClasseServiceImplService");
		Service ws = Service.create(url, qname);
		ClasseService classe = ws.getPort(ClasseService.class);

		for (int i = 0; i <5; i++) {
			String nome = "nome" + i;
			System.out.println("Classe Animal " + i + " " + classe.buscarClasse(nome));
		}
	}
}
