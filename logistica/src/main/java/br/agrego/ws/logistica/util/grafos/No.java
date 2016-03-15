package br.agrego.ws.logistica.util.grafos;

import java.util.List;

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

	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return nome;
	}

}
