package br.agrego.ws.logistica.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MalhaVO {


	@XmlElement(name="nome")
	private String nome;

	@XmlElement(name="rotas")
	private PontosVO pontos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PontosVO getPontos() {
		return pontos;
	}

	public void setPontos(PontosVO pontos) {
		this.pontos = pontos;
	}
	
}
