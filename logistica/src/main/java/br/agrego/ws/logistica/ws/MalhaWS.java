package br.agrego.ws.logistica.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.agrego.ws.logistica.dao.MapaDao;
import br.agrego.ws.logistica.domain.Mapa;
import br.agrego.ws.logistica.domain.Rota;

@WebService(name="malha")
public class MalhaWS {
	
	@WebMethod(operationName="melhorRota")
	@WebResult(name="rota")
	public RotaVO getMelhorRota(@WebParam(name="mapa") MapaVO mapaVO) {
		MapaDao mapaDao = new MapaDao();

		Mapa mapa = mapaDao.findByNome(mapaVO.getMapa());
		
		RotaVO rotaVO = new RotaVO(mapa.getMenotCaminho(), mapa.calculaCusto(mapaVO.getOrigem(), mapaVO.getDestino(), mapaVO.getAutonomia(), mapaVO.getValorCombustivel()));
		
		return rotaVO;
		
	}

	@WebMethod(operationName="novaMalha")
	@WebResult(name="salvo")
	public Boolean novaMalha(@WebParam(name="mapa") MalhaVO malha) {
		MapaDao mapaDao = new MapaDao();
		
		Mapa mapa = new Mapa();
		mapa.setNome(malha.getNome());
		
		for (PontoVO ponto : malha.getPontos().getPonto()) {
			Rota rota = new Rota(ponto.getOrigem(), ponto.getDestino(), ponto.getDistancia());
			mapa.addRota(rota);
		}
		
		mapaDao.insert(mapa);
		
		return true;
	}
	
	
}
