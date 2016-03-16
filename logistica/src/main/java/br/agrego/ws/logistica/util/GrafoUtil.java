package br.agrego.ws.logistica.util;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.agrego.ws.logistica.domain.Rota;
import br.agrego.ws.logistica.util.grafos.Aresta;
import br.agrego.ws.logistica.util.grafos.CalculaCaminho;
import br.agrego.ws.logistica.util.grafos.Caminho;
import br.agrego.ws.logistica.util.grafos.No;

/**
 * Destinado a facilitar a criação dos caminhos dos grafos para o ws
 * @author Andrey Galassi
 *
 */
public class GrafoUtil {

//	private final List<No> nos = new ArrayList<No>();
	private final Map<String,No> mapNos = new HashMap<String, No>();
	private final BigDecimal custo;
	private final BigDecimal distancia;
	private final Caminho melhorCaminho;
	
	private void montaGrafo(List<Rota> rotas) {
		for (Rota rota : rotas) {
			if (!mapNos.containsKey(rota.getOrigem())) {
				mapNos.put(rota.getOrigem(), new No(rota.getOrigem()));
			}
			if (!mapNos.containsKey(rota.getDestino())) {
				mapNos.put(rota.getDestino(), new No(rota.getDestino()));
			}
			No noOrigem = mapNos.get(rota.getOrigem());
			No noDestino = mapNos.get(rota.getDestino());
			new Aresta(noOrigem, noDestino, rota.getDistancia());
			
		}
	}
	
	public GrafoUtil(List<Rota> rotas, String origem, String destino, BigDecimal autonomia, BigDecimal valorCombustivel) {
		montaGrafo(rotas);
		
		CalculaCaminho caminho = new CalculaCaminho();
		
		caminho.calculaCaminho(mapNos.get(origem), mapNos.get(destino), null);
		
		melhorCaminho = caminho.getMelhorCaminho();
		
		distancia = caminho.getMelhorCaminho().getPeso();
		
		if (autonomia!=null && !autonomia.equals(BigDecimal.ZERO) && valorCombustivel!=null) {
			custo = distancia.divide(autonomia).multiply(valorCombustivel);
		}else {
			custo = BigDecimal.ZERO;
		}
	}

	public BigDecimal getCusto() {
		return custo;
	}

	public Caminho getMelhorCaminho() {
		return melhorCaminho;
	}

	public BigDecimal getDistancia() {
		return distancia;
	}
	
	
	
}
