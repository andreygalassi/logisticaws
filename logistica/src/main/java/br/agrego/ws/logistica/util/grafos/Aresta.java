package br.agrego.ws.logistica.util.grafos;

import java.math.BigDecimal;

/**
 * define uma aresta como dendo um peso, um nó de origem e um nó de destino.
 * esta aresta ainda deve ser inserida em seus nós
 * @author Andrey Galassi
 *
 */
public class Aresta {

	private final BigDecimal peso;
	private final No origem;
	private final No destino;
	
	public Aresta(No origem,No destino,BigDecimal peso) {
		this.origem = origem;
		this.destino = destino;
		this.peso = peso;
		this.origem.addAresta(this);
		this.destino.addAresta(this);
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
