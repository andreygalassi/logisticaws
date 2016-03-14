package br.agrego.ws.logistica.domain;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="rota")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Rota {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@XmlTransient
	private Long id;
	
	@XmlElement(name="origem")
	private String origem;
	
	@XmlElement(name="destino")
	private String destino;
	
	@XmlElement(name="distancia")
	private BigDecimal distancia;
	
	@ManyToOne(cascade= {CascadeType.MERGE},fetch=FetchType.LAZY)
	@XmlTransient
	private Mapa mapa;
	
	@Deprecated
	public Rota() {
		super();
	}
	public Rota(String origem, String destino, BigDecimal distancia) {
		super();
		this.origem=origem;
		this.destino=destino;
		this.distancia=distancia;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public BigDecimal getDistancia() {
		return distancia;
	}
	public void setDistancia(BigDecimal distancia) {
		this.distancia = distancia;
	}
	public Mapa getMapa() {
		return mapa;
	}
	public void setMapa(Mapa mapa) {
		this.mapa = mapa;
	}
}
