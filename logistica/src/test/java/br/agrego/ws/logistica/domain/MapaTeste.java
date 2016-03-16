package br.agrego.ws.logistica.domain;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.agrego.ws.logistica.util.GrafoUtil;


public class MapaTeste {

	@Test
	public void deveCalcularDistanciaDaRota() {
		Mapa mapa = new Mapa();
		
		mapa.addRota(new Rota("A", "B", new BigDecimal("10")));
		mapa.addRota(new Rota("B", "D", new BigDecimal("15")));
		mapa.addRota(new Rota("A", "C", new BigDecimal("20")));
		mapa.addRota(new Rota("C", "D", new BigDecimal("30")));
		mapa.addRota(new Rota("B", "E", new BigDecimal("50")));
		mapa.addRota(new Rota("D", "E", new BigDecimal("30")));

		mapa.setNome("SP");

		GrafoUtil grafo = new GrafoUtil(mapa.getRotas(), "A", "D", BigDecimal.ZERO, BigDecimal.ZERO);
		
		assertEquals(new BigDecimal("25"), grafo.getDistancia());

	}
	
	public void deveCalcularCustoTotalDaRota() {
		Mapa mapa = new Mapa();
		
		mapa.getRotas().add(new Rota("A", "B", new BigDecimal("10")));
		mapa.getRotas().add(new Rota("B", "D", new BigDecimal("15")));
		mapa.getRotas().add(new Rota("A", "C", new BigDecimal("20")));
		mapa.getRotas().add(new Rota("C", "D", new BigDecimal("30")));
		mapa.getRotas().add(new Rota("B", "E", new BigDecimal("50")));
		mapa.getRotas().add(new Rota("D", "E", new BigDecimal("30")));
		
		BigDecimal autonomia = new BigDecimal("10");
		BigDecimal valorLitro = new BigDecimal("2,50");
		
		GrafoUtil grafo = new GrafoUtil(mapa.getRotas(), "A", "D", autonomia, valorLitro);

		assertEquals(new BigDecimal("6.25"), grafo.getCusto());
	}
	
}
