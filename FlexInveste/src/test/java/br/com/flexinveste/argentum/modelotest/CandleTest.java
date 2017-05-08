package br.com.flexinveste.argentum.modelotest;

import java.util.Calendar;

import org.junit.Test;

import br.com.flexinveste.argentum.modelo.Candle;

public class CandleTest {

	@Test(expected=IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo() {
		new Candle(10, 20, 20, 10, 10000, Calendar.getInstance());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void dataNula() {
		new Candle(10, 20, 20, 30, 10000, null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void valoresNaoPodemSerMenoresQueZero() {
		new Candle(10, 20, 20, 30, -10, Calendar.getInstance());
	}
	
	

}
