package br.agrego.ws.logistica.ws;

import javax.xml.ws.Endpoint;

public class PublicaWebService {

	public static void main(String[] args) {
		
		MalhaWS ws = new MalhaWS();
		
		String url = "http://localhost:8080/logisticaws";
		
		Endpoint.publish(url, ws);
		
		System.out.println("WS rodando!");
	}
}
