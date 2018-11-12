package br.ucsal.ordem;

import javax.xml.ws.Endpoint;

public class OrdemServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8888/ordem", new OrdemServiceImpl());
	}
}
