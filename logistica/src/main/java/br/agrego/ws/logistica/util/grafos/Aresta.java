package br.agrego.ws.logistica.util.grafos;

import java.math.BigDecimal;

public class Aresta {

	private final BigDecimal peso;
	private final No origem;
	private final No destino;
	
	public Aresta(No origem,No destino,BigDecimal peso) {
		this.origem = origem;
		this.destino = destino;
		this.peso = peso;
	}
	
	public BigDecimal getPeso() {
		return peso;
	}

	public No getOrigem() {
		return origem;
	}

	public No getDestino() {
		return destino;
	}
	
	
}
