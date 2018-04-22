package org.careercon2018.examples.example5.parametrized;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.careercon2018.examples.example5.ImprovedCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class ParametrizedPowerTest {
	@ParameterizedTest(name = "{0} to power {1} should be equal to {2}")
	@MethodSource("powerFunctionParams")
	@DisplayName("Test power function")
	public void testPower(Double arg1, Double arg2, Double result) {
		ImprovedCalculator ic = new ImprovedCalculator(arg1, arg2);
		assertEquals(result, ic.power());
	}
	
	static Stream<Arguments> powerFunctionParams() {
	    return Stream.of(
	    		Arguments.of(10.0, 0.0, 1.0),
	    		Arguments.of(3.0, 2.0, 9.0),
	    		Arguments.of(-3.0, 3.0, -27.0)
	    	);
	}
}
