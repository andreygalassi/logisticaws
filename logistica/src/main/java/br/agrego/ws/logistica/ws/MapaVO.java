package br.agrego.ws.logistica.ws;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class MapaVO {

	@XmlElement(name="mapa",required=true)
	private String mapa;
	@XmlElement(name="origem",required=true)
	private String origem;
	@XmlElement(name="destino",required=true)
	private String destino;
	@XmlElement(name="autonomia",required=true)
	private BigDecimal autonomia;
	@XmlElement(name="valorCombustivel",required=true)
	private BigDecimal valorCombustivel;
	
	public MapaVO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getMapa() {
		return mapa;
	}
	public void setMapa(String mapa) {
		this.mapa = mapa;
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
	public BigDecimal getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(BigDecimal autonomia) {
		this.autonomia = autonomia;
	}
	public BigDecimal getValorCombustivel() {
		return valorCombustivel;
	}
	public void setValorCombustivel(BigDecimal valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}
	
}
