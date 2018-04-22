package org.careercon2018.examples.example5.all;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.careercon2018.examples.example5.ImprovedCalculator;
import org.junit.jupiter.api.Test;

public class TestTheCalculator {
	@Test
	public void shouldCalculatePositiveValues() {
		ImprovedCalculator sc = new ImprovedCalculator(3.0, 2.0);
		assertEquals((Double) 5.0, sc.add());
		assertEquals((Double) 1.0, sc.substract());
		assertEquals((Double) 6.0, sc.multiply());
		assertEquals((Double) 9.0, sc.power());
		assertEquals((Double) 1.5, sc.divide());
	}
	
	@Test
	public void shouldCalculatePositiveAndNegativeValues() {
		ImprovedCalculator sc = new ImprovedCalculator(-5.0, 4.0);
		assertEquals((Double) (-1.0), sc.add());
		assertEquals((Double) (-9.0), sc.substract());
		assertEquals((Double) (-20.0), sc.multiply());
		assertEquals((Double) 625.0, sc.power());
		assertEquals((Double) (-1.25), sc.divide());
	}
	
	@Test
	public void shouldCalculateZeros() {
		ImprovedCalculator sc = new ImprovedCalculator(1.0, 0.0);
		assertEquals((Double) 1.0, sc.add());
		assertEquals((Double) 1.0, sc.substract());
		assertEquals((Double) 0.0, sc.multiply());
		assertEquals((Double) 1.0, sc.power());
		assertTrue(Double.isInfinite(sc.divide()));
	}
}
