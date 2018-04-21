package org.careercon2018.examples.example4;
/*
 * Calculates stuff. Now with our in-house power function.
 * Division not supported yet.
 */
public class SophisticatedCalculator {
	protected Double arg1;
	protected Double arg2;
	
	public SophisticatedCalculator(Double arg1, Double arg2) {
		this.arg1 = arg1;
		this.arg2 = arg2;
	}
	
	public Double add() {
		return this.arg1 + this.arg2;
	}
	
	public Double substract() {
		return this.arg1 - this.arg2;
	}
	
	public Double multiply() {
		return this.arg1 * this.arg2;
	}
	
	public Double divide() {
		throw new UnsupportedOperationException("I'll add division in next version. Maybe");
	}
	
	public Double power() {
		Double result = this.arg1;
		for (int i = 0; i < this.arg2 -1; i++) {
			result *= this.arg1;
		}
		return result;
	}
}
