package br.agrego.ws.logistica.ws;

import javax.jws.WebService;

import br.agrego.ws.logistica.domain.Mapa;

@WebService
public class MalhaWS {

	public Mapa getMalha() {
		Mapa malha = new Mapa();
		malha.setId(1l);
		return malha;
	}
}
