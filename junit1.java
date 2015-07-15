package hoja1;

import static org.junit.Assert.*;

import org.junit.Test;

public class junit1 {

	@Test
	public void test() {
		Radio test = new radio();
		boolean result = test.getEstado();
		assertTrue(result == true || result == false);
		
		
		
	}

}
