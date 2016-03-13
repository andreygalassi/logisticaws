package br.agrego.ws.logistica.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
public class Mapa {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nome;
	@OneToMany(mappedBy="mapa",orphanRemoval=true,fetch=FetchType.EAGER)
	private List<Rota> rotas = new ArrayList<Rota>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Mapa other = (Mapa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Rota> getRotas() {
		return rotas;
	}

	public void setRotas(List<Rota> rotas) {
		this.rotas = rotas;
	}

	@Transient
	public BigDecimal calculaDistanciaTotal(String origem, String destino) {
		for (Rota rotaOrigem : rotas) {
			for (Rota rotaDestino : rotas) {
				
			}
		}
		return null;
	}
	
}
