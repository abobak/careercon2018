package org.careercon2018.examples.example4.testAll;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.careercon2018.examples.example4.SophisticatedCalculator;
import org.junit.jupiter.api.Test;

public class TestTheCalculator {
	@Test
	public void shouldCalculatePositiveValues() {
		SophisticatedCalculator sc = new SophisticatedCalculator(3.0, 2.0);
		assertEquals((Double) 5.0, sc.add());
		assertEquals((Double) 1.0, sc.substract());
		assertEquals((Double) 6.0, sc.multiply());
		assertEquals((Double) 9.0, sc.power());
		assertThrows(UnsupportedOperationException.class, () -> sc.divide());
	}
	
	@Test
	public void shouldCalculatePositiveAndNegativeValues() {
		SophisticatedCalculator sc = new SophisticatedCalculator(-5.0, 4.0);
		assertEquals((Double) (-1.0), sc.add());
		assertEquals((Double) (-9.0), sc.substract());
		assertEquals((Double) (-20.0), sc.multiply());
		assertEquals((Double) 625.0, sc.power());
		assertThrows(UnsupportedOperationException.class, () -> sc.divide());
	}
	
	@Test
	public void shouldCalculateZeros() {
		SophisticatedCalculator sc = new SophisticatedCalculator(1.0, 0.0);
		assertEquals((Double) 1.0, sc.add());
		assertEquals((Double) 1.0, sc.substract());
		assertEquals((Double) 0.0, sc.multiply());
		assertEquals((Double) 1.0, sc.power());
		assertThrows(UnsupportedOperationException.class, () -> sc.divide());
	}
}
