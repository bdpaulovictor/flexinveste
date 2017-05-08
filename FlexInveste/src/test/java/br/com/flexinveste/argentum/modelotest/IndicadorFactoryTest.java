package br.com.flexinveste.argentum.modelotest;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import br.com.flexinveste.argentum.indicadores.Indicador;
import br.com.flexinveste.argentum.modelo.IndicadorAbertura;
import br.com.flexinveste.argentum.modelo.IndicadorFactory;
import br.com.flexinveste.argentum.modelo.MediaMovelSimples;

public class IndicadorFactoryTest {

	@Test
	public void testMontaAbertura() {
		String nomeIndicador = "IndicadorAbertura";
		IndicadorFactory indicadorFactory = new IndicadorFactory(nomeIndicador, null);
		
		Indicador indicador = indicadorFactory.getIndicador();
		
		Assert.assertTrue(indicador instanceof IndicadorAbertura);
	}
	
	@Test
	public void testMontaAberturaComMediaMovelSimples(){
		String nomeIndicador = "IndicadorAbertura";
		String nomeMedia = "MediaMovelSimples";
		
		IndicadorFactory indicadorFactory = new IndicadorFactory(nomeIndicador, nomeMedia);
		
		Indicador indicador = indicadorFactory.getIndicador();
		
		Assert.assertTrue(indicador instanceof MediaMovelSimples);
		
	}
}
