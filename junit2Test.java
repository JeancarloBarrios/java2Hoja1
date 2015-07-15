package hoja1;

import static org.junit.Assert.*;

import org.junit.Test;

public class junit2Test {

	@Test
	public void test() {
		RADIO test = new radio();
		test.setESTADO(true);
		boolean result = test.getEstado();
		assertTrue(result==false);
	}

}
