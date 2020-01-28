package org.careercon2018.examples.example1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TestOneReasonToFailAtOnce {
	@Test
	void shouldHaveNameSetFromInput() {
		Integer input = 9;
		SampleObject so = new SampleObject(input);
		assertEquals(input.toString(), so.getName());
	}
	
	@Test
	void shouldHaveSquareFieldSetCorrectly() {
		SampleObject so = new SampleObject(7);
		assertEquals(49, so.getSquareInput().intValue());
	}
	
	@Test
	void numbersLengthShouldBeEqualToInputValue() {
		SampleObject so = new SampleObject(22);
		assertEquals(22, so.getNumbersSize());
	}
}
