package br.agrego.ws.logistica.ws;

import javax.jws.WebService;

import br.agrego.ws.logistica.domain.Malha;

@WebService
public class MalhaWS {

	public Malha getMalha() {
		Malha malha = new Malha();
		malha.setId(1l);
		return malha;
	}
}
