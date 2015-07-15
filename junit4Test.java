package hoja1;

import static org.junit.Assert.*;

import org.junit.Test;

public class junit4Test {

	@Test
	public void test() {
		RADIO test = new radio();
		double freqi = test.getEmisora();
		test.Sintonizar(true);
		double freqr = freqi + 0.1;
		double ressult = test.getEmisora();
		assertTrue(ressult==freqr);
	}

}
