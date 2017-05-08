package br.com.flexinveste.argentum.indicadores;

import br.com.flexinveste.argentum.modelo.SerieTemporal;

public interface Indicador {

	public abstract double calcula(int posicao, SerieTemporal serie);

}