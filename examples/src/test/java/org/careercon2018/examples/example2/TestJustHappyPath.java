package org.careercon2018.examples.example2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestJustHappyPath {
	@Test
	public void checkDividingTwoPositiveValues() {
		SophisticatedDivisor sd = new SophisticatedDivisor(10, 2);
		assertEquals(5, sd.getResult().intValue());
	}
	
	@Test
	public void checkDividingPositiveAndNegativeValues() {
		SophisticatedDivisor sd = new SophisticatedDivisor(-30, 15);
		assertEquals(-2, sd.getResult().intValue());
	}
	
	@Test
	public void checkDividingTwoNegativeValues() {
		SophisticatedDivisor sd = new SophisticatedDivisor(-33, -11);
		assertEquals(3, sd.getResult().intValue());
	}
	
}
