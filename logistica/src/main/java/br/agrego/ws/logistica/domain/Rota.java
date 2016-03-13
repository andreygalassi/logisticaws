package br.agrego.ws.logistica.domain;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Rota {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String origem;
	private String destino;
	private BigDecimal distancia;
	@ManyToOne(cascade=CascadeType.MERGE,fetch=FetchType.LAZY)
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
