package br.com.flexinveste.argentum.modelo;

import br.com.flexinveste.argentum.indicadores.Indicador;

public class IndicadorAbertura implements Indicador {

	@Override
	public double calcula(int posicao, SerieTemporal serie) {
		return serie.getCandle(posicao).getAbertura();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Abertura";
	}
	
}
