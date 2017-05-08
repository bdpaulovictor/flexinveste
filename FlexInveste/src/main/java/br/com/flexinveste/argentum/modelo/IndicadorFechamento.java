package br.com.flexinveste.argentum.modelo;

import br.com.flexinveste.argentum.indicadores.Indicador;

public class IndicadorFechamento implements Indicador {

	@Override
	public double calcula(int posicao, SerieTemporal serie) {
		return serie.getCandle(posicao).getFechamento();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fechamento";
	}
	
}
