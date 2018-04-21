package org.careercon2018.examples.example4.testIndividually;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.careercon2018.examples.example4.SophisticatedCalculator;
import org.junit.jupiter.api.Test;

public class TestMultiply {
	@Test
	public void shouldCalculatePositiveValues() {
		SophisticatedCalculator sc = new SophisticatedCalculator(3.0, 2.0);
		assertEquals((Double) 6.0, sc.multiply());
	}
	
	@Test
	public void shouldCalculatePositiveAndNegativeValues() {
		SophisticatedCalculator sc = new SophisticatedCalculator(-5.0, 4.0);
		assertEquals((Double) (-20.0), sc.multiply());
	}
	
	@Test
	public void shouldCalculateZeros() {
		SophisticatedCalculator sc = new SophisticatedCalculator(1.0, 0.0);
		assertEquals((Double) 0.0, sc.multiply());
	}
}
