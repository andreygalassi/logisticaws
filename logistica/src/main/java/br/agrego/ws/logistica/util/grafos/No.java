package br.agrego.ws.logistica.util.grafos;

import java.util.ArrayList;
import java.util.List;

/**
 * Identificando cada nó com seu nome e listando as arestas de conexões com outros nós
 * @author Andrey Galassi
 *
 */
public class No {
	
	private final String nome;
	private List<Aresta> arestas = new ArrayList<Aresta>();
	
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		No other = (No) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
