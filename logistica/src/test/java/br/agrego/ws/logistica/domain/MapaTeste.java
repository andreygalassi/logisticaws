package br.agrego.ws.logistica.domain;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;


public class MapaTeste {

	@Test
	public void deveCalcularDistanciaDaRota() {
		Mapa mapa = new Mapa();
		
		mapa.getRotas().add(new Rota("A", "B", new BigDecimal("10")));
		mapa.getRotas().add(new Rota("B", "D", new BigDecimal("15")));
		mapa.getRotas().add(new Rota("A", "C", new BigDecimal("20")));
		mapa.getRotas().add(new Rota("C", "D", new BigDecimal("30")));
		mapa.getRotas().add(new Rota("B", "E", new BigDecimal("50")));
		mapa.getRotas().add(new Rota("D", "E", new BigDecimal("30")));

		Assert.assertEquals(new BigDecimal("35"), mapa.calculaDistanciaTotal("A","D"));

	}
	
}
