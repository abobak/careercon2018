package org.careercon2018.examples.example3;

public class DivisorWithValidation {
	Integer arg1;
	Integer arg2;
	Integer result;
	
	public DivisorWithValidation(Integer arg1, Integer arg2) {
		if (arg2 == 0) {
			throw new ArithmeticException("Divisor can't be zero");
		}
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.result = arg1 / arg2;
	}
}
