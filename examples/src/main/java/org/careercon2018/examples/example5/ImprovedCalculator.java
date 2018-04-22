package org.careercon2018.examples.example5;

import org.careercon2018.examples.example4.SophisticatedCalculator;

public class ImprovedCalculator extends SophisticatedCalculator{

	public ImprovedCalculator(Double arg1, Double arg2) {
		super(arg1, arg2);
	}
	
	public Double divide() {
		return this.arg1 / this.arg2;
	}
	
	public Double power() {
		return Math.pow(this.arg1, this.arg2);
	}

}
