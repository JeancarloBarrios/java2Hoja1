package hoja1;

import static org.junit.Assert.*;

import org.junit.Test;

public class junit3 {

	@Test
	public void test() {
		RADIO test = new radio();
		int result = test.getAMFM();
		
		assertTrue(result==1 || result == 0);
	}

}
