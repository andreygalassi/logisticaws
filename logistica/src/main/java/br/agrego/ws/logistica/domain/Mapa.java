package br.agrego.ws.logistica.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="mapa")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Mapa {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlTransient
	private Long id;
	
	@XmlElement(name="nome")
	@Column(unique=true)
	private String nome;
	
	@XmlElement(name="rotas")
	@OneToMany(mappedBy="mapa",orphanRemoval=true,fetch=FetchType.EAGER,cascade= {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Rota> rotas = new ArrayList<Rota>();
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	public void addRota(Rota rota) {
		rota.setMapa(this);
		this.rotas.add(rota);
	}

	public void setRotas(List<Rota> rotas) {
		this.rotas = rotas;
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
}
