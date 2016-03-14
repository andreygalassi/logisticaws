package br.agrego.ws.logistica.ws;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class PontosVO {

	@XmlElement(name="rota")
	private List<PontoVO> ponto = new ArrayList<PontoVO>();

	public List<PontoVO> getPonto() {
		return ponto;
	}

	public void setPonto(List<PontoVO> ponto) {
		this.ponto = ponto;
	}
}
