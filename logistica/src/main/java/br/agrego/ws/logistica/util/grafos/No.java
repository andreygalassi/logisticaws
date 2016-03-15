package br.agrego.ws.logistica.util.grafos;

import java.util.List;

/**
 * Identificando cada nó com seu nome e listando as arestas de conexões com outros nós
 * @author Andrey Galassi
 *
 */
public class No {
	
	private final String nome;
	private List<Aresta> arestas;
	
	public No(String nome) {
		this.nome = nome;
	}

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}
	
	public void addAresta(Aresta aresta) {
		this.arestas.add(aresta);
	}

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}

}
