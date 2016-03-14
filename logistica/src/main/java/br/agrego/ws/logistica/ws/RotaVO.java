package br.agrego.ws.logistica.ws;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="rota")
public class RotaVO {

	private String caminho;
	private BigDecimal custo;
	
	@Deprecated
	public RotaVO() {
		super();
	}
	
	public RotaVO(String caminho, BigDecimal custo) {
		super();
		this.caminho = caminho;
		this.custo = custo;
	}
	
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	public BigDecimal getCusto() {
		return custo;
	}
	public void setCusto(BigDecimal custo) {
		this.custo = custo;
	}
}
