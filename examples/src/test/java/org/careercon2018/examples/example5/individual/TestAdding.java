package org.careercon2018.examples.example5.individual;

import static org.junit.Assert.assertEquals;

import org.careercon2018.examples.example5.ImprovedCalculator;
import org.junit.jupiter.api.Test;

public class TestAdding {
	@Test
	public void shouldCalculatePositiveValues() {
		ImprovedCalculator ic = new ImprovedCalculator(3.0, 2.0);
		assertEquals((Double) 5.0, ic.add());
	}
	
	@Test
	public void shouldCalculatePositiveAndNegativeValues() {
		ImprovedCalculator ic = new ImprovedCalculator(-5.0, 4.0);
		assertEquals((Double) (-1.0), ic.add());
	}
	
	@Test
	public void shouldCalculateZeros() {
		ImprovedCalculator ic = new ImprovedCalculator(1.0, 0.0);
		assertEquals((Double) 1.0, ic.add());
	}
}
