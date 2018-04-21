package org.careercon2018.examples.example3;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TestExceptionWithRules {
	@Rule
	public ExpectedException ex = ExpectedException.none();
	
	@Test
	public void shouldThrowExceptionForDivizorEqualToZero() {
		ex.expect(ArithmeticException.class);
		new DivisorWithValidation(1, 0);
	}
}
