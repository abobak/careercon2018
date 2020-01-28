package org.careercon2018.examples.example4.testPowerFunctionFailure;

import static org.junit.Assert.assertEquals;
import org.careercon2018.examples.example4.SophisticatedCalculator;
import org.junit.jupiter.api.Test;

class TestPower {
	@Test
	void zeroAsFirstParameterIsOk() {
		SophisticatedCalculator sc = new SophisticatedCalculator(0.0, 3.0);
		assertEquals((Double) 0.0, sc.power());
	}
	
	@Test
	void zeroAsSecondParameterIsOk() {
		SophisticatedCalculator sc = new SophisticatedCalculator(3.0, 0.0);
		assertEquals((Double) 1.0, sc.power());
	}
	
}
