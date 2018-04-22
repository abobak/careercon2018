package org.careercon2018.examples.example5.parametrized;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.careercon2018.examples.example5.ImprovedCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ParametrizedDivisionTest {
	@ParameterizedTest(name = "{0} divided by {1} should be equal to {2}")
	@MethodSource("divisionFunctionParams")
	@DisplayName("Test division function")
	public void testDivision(Double arg1, Double arg2, Double result) {
		ImprovedCalculator ic = new ImprovedCalculator(arg1, arg2);
		assertEquals(result, ic.divide());
	}
	
	static Stream<Arguments> divisionFunctionParams() {
	    return Stream.of(
	    		Arguments.of(10.0, 10.0, 1.0),
	    		Arguments.of(3.0, 2.0, 1.5),
	    		Arguments.of(33.0, 11.0, 3.0),
	    		Arguments.of(9.0, 4.5, 2.0),
	    		Arguments.of(-1.0, -1.0, 1.0),
	    		Arguments.of(0.0, 2.0, 0.0),
	    		Arguments.of(-3.0, 3.0, -1.0)
	    	);
	}
}
