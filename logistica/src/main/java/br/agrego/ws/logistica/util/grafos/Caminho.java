package br.agrego.ws.logistica.util.grafos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * caminho percorrido
 * @author Andrey Galassi
 *
 */
public class Caminho {
	
	private final List<Aresta> arestas = new ArrayList<Aresta>();
	private BigDecimal peso = BigDecimal.ZERO;

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void addAresta(Aresta aresta) {
		arestas.add(aresta);
	}

	public BigDecimal getPeso() {
		return peso;
	}

	public void setPeso(BigDecimal peso) {
		this.peso = peso;
	}

}
