package br.ucsal.classe;

import javax.xml.ws.Endpoint;

public class ClasseServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8889/classe", new ClasseServiceImpl());
	}
}
