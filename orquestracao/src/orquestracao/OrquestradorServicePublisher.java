package orquestracao;

import javax.xml.ws.Endpoint;

public class OrquestradorServicePublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8090/orquestracao", new OrquestradorServiceImpl());
	}
}
