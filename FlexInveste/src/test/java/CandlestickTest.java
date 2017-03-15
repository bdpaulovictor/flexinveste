

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import br.com.caelum.flexInveste.modelo.Candlestick;

public class CandlestickTest {

	@Test
	public void precoMaximoNaoPodeSerMenorQueMinimo() {
		new Candlestick(10, 20, 20, 10, 10000, Calendar.getInstance());
	}

}
