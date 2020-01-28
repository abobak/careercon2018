package org.careercon2018.examples.example3;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TestExceptionWithJunit5Assertion {
	@Test
	void shouldThrowExceptionForDivizorEqualToZero() {
		assertThrows(ArithmeticException.class, () -> new DivisorWithValidation(3, 0));
	}
}
