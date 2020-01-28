package org.careercon2018.examples.example1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TestAllTheThings {
	@Test
	void testOk() {
		Integer input = 9;
		SampleObject so = new SampleObject(input);
		assertEquals(81, so.getSquareInput().intValue());
		assertEquals(9, so.getNumbersSize());
		assertEquals(input.toString(), so.getName());
	}
}
