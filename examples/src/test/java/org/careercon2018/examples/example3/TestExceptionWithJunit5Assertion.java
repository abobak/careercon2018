package org.careercon2018.examples.example3;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TestExceptionWithJunit5Assertion {
	@Test
	public void shouldThrowExceptionForDivizorEqualToZero() {
		assertThrows(ArithmeticException.class, () -> new DivisorWithValidation(3, 0));
	}
}
