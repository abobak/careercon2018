package org.careercon2018.examples.example2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TestWithZero {
	@Test
	void zeroAsFirstArgumentShouldBeOk() {
		SophisticatedDivisor sd = new SophisticatedDivisor(0, 2);
		assertEquals(0, sd.getResult().intValue());
	}
	
	@Test
	void zeroAsSecondArgumentShouldBeOk() {
		SophisticatedDivisor sd = new SophisticatedDivisor(4, 0);
		assertEquals(4, sd.getResult().intValue());
	}
	
}
