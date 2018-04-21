package org.careercon2018.examples.example4.testIndividually;

import static org.junit.Assert.assertEquals;

import org.careercon2018.examples.example4.SophisticatedCalculator;
import org.junit.jupiter.api.Test;

public class TestAdding {
	@Test
	public void shouldCalculatePositiveValues() {
		SophisticatedCalculator sc = new SophisticatedCalculator(3.0, 2.0);
		assertEquals((Double) 5.0, sc.add());
	}
	
	@Test
	public void shouldCalculatePositiveAndNegativeValues() {
		SophisticatedCalculator sc = new SophisticatedCalculator(-5.0, 4.0);
		assertEquals((Double) (-1.0), sc.add());
	}
	
	@Test
	public void shouldCalculateZeros() {
		SophisticatedCalculator sc = new SophisticatedCalculator(1.0, 0.0);
		assertEquals((Double) 1.0, sc.add());
	}
}
