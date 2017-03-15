package br.com.caelum.flexInveste.testes;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.flexInveste.modelo.Candlestick;
import br.com.caelum.flexInveste.modelo.CandlestickFactory;
import br.com.caelum.flexInveste.modelo.Negociacao;

public class TestaCandlestickFactoryComUmaNegociacaoApenas {
	public static void main(String[] args) {
	    Calendar hoje = Calendar.getInstance();
	    
	    Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);
	    Negociacao negociacao2 = new Negociacao(45.0, 100, hoje);
	    Negociacao negociacao3 = new Negociacao(49.8, 100, hoje);
	    Negociacao negociacao4 = new Negociacao(53.3, 100, hoje);
	    
	    List<Negociacao> negociacoes = Arrays.asList(negociacao1);
	    List<Negociacao> negociacoes2 = Arrays.asList(negociacao2);
	    List<Negociacao> negociacoes3 = Arrays.asList(negociacao3);
	    List<Negociacao> negociacoes4 = Arrays.asList(negociacao4);
	    
	    CandlestickFactory fabrica = new CandlestickFactory();
	    Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);
	    
	    System.out.println(candle.getAbertura());
	    System.out.println(candle.getFechamento());
	    System.out.println(candle.getMinimo());
	    System.out.println(candle.getMaximo());
	    System.out.println(candle.getVolume());
	  }
}
