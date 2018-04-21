package org.careercon2018.examples.example1;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TestAllTheThings {
	@Test
	public void testOk() {
		Integer input = new Integer(9);
		SampleObject so = new SampleObject(input);
		assertEquals(81, so.getSquareInput().intValue());
		assertEquals(9, so.getNumbersSize());
		assertEquals(input.toString(), so.getName());
	}
}
