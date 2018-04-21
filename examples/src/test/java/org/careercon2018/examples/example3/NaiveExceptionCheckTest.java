package org.careercon2018.examples.example3;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

public class NaiveExceptionCheckTest {
	@Test
	public void shouldThrowExceptionForDivizorEqualToZero() {
		try {
			new DivisorWithValidation(1, 0);
			fail("Should throw exception");
		} catch (Exception e) {
			assertTrue(true);
		}
	}

}
