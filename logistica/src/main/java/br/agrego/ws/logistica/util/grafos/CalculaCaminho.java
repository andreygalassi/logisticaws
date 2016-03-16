package br.agrego.ws.logistica.util.grafos;

/**
 * destinado ao calculo do melhor caminho
 * @author Andrey Galassi
 *
 */
public class CalculaCaminho {

	private Caminho melhorCaminho;
	
	public void calculaCaminho(No origem, No destino, Caminho caminho) {
		for (Aresta aresta : origem.getArestas()) {
			Caminho caminhoAux = new Caminho();
			if (caminho!=null) {
				if (caminho.getArestas().contains(aresta)) {
					continue;
				}
				caminhoAux.getArestas().addAll(caminho.getArestas());
				caminhoAux.setPeso(caminhoAux.getPeso().add(caminho.getPeso()));
			}
			caminhoAux.addAresta(aresta);
			caminhoAux.setPeso(caminhoAux.getPeso().add(aresta.getPeso()));
			
			if (aresta.getOrigem().equals(destino)||aresta.getDestino().equals(destino)) {
				if (melhorCaminho == null || melhorCaminho.getPeso().compareTo(caminhoAux.getPeso()) > 0 ) {
					melhorCaminho = caminhoAux;
				}
				return;
			}
			No noAux = (aresta.getOrigem().equals(origem)?aresta.getDestino():aresta.getOrigem());
			calculaCaminho(noAux, destino, caminhoAux);
		}
	}

	public Caminho getMelhorCaminho() {
		return melhorCaminho;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(melhorCaminho.getArestas().get(0).getOrigem().getNome());
		for (Aresta aresta : melhorCaminho.getArestas()) {
			sb.append(" "+aresta.getDestino().getNome());
		}
//		sb.append(" = " + melhorCaminho.getPeso());
		return sb.toString(); 
	}
}
