package br.agrego.ws.logistica.util.grafos;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class CalculaCaminhoTeste {
	
	private No	a;
	private No	b;
	private No	c;
	private No	d;
	private No	e;

	@Before
	public void init() {
		a = new No("A");
		b = new No("B");
		c = new No("C");
		d = new No("D");
		e = new No("E");

		new Aresta(a, b, new BigDecimal(10));
		new Aresta(b, d, new BigDecimal(15));
		new Aresta(a, c, new BigDecimal(20));
		new Aresta(c, d, new BigDecimal(30));
		new Aresta(b, e, new BigDecimal(50));
		new Aresta(d, e, new BigDecimal(30));
	}
	
	@Test
	public void deveCalculaMelhorCaminho() {
		
		CalculaCaminho calcula = new CalculaCaminho();
		
		calcula.calculaCaminho(a, d, null);
		
		assertEquals(2, calcula.getMelhorCaminho().getArestas().size());
		assertEquals(a, calcula.getMelhorCaminho().getArestas().get(0).getOrigem());
		assertEquals(b, calcula.getMelhorCaminho().getArestas().get(0).getDestino());
		assertEquals(b, calcula.getMelhorCaminho().getArestas().get(1).getOrigem());
		assertEquals(d, calcula.getMelhorCaminho().getArestas().get(1).getDestino());
		assertEquals(new BigDecimal("25"), calcula.getMelhorCaminho().getPeso());
		
//		System.out.println(calcula);
	}
}
