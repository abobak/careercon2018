package org.careercon2018.examples.example5.individual;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.careercon2018.examples.example4.SophisticatedCalculator;
import org.careercon2018.examples.example5.ImprovedCalculator;
import org.junit.jupiter.api.Test;

class TestSubstracting {
	@Test
	void shouldCalculatePositiveValues() {
		ImprovedCalculator ic = new ImprovedCalculator(3.0, 2.0);
		assertEquals((Double) 1.0, ic.substract());
	}
	
	@Test
	void shouldCalculatePositiveAndNegativeValues() {
		ImprovedCalculator ic = new ImprovedCalculator(-5.0, 4.0);
		assertEquals((Double) (-9.0), ic.substract());
	}
	
	@Test
	void shouldCalculateZeros() {
		ImprovedCalculator ic = new ImprovedCalculator(1.0, 0.0);
		assertEquals((Double) 1.0, ic.substract());
	}
}
