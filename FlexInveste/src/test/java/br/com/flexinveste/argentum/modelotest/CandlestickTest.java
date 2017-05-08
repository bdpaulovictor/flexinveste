package br.com.flexinveste.argentum.modelotest;

import java.util.Calendar;

import org.junit.Test;

import br.com.flexinveste.argentum.modelo.Candlestick;

public class CandlestickTest {

	@Test(expected=IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo() {
		new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void dataNula() {
		new Candlestick(10, 20, 20, 30, 10000, null);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void valoresNaoPodemSerMenoresQueZero() {
		new Candlestick(10, 20, 20, 30, -10, Calendar.getInstance());
	}
	
	

}
