package org.careercon2018.examples.example2;

import lombok.Getter;

@Getter
public class SophisticatedDivisor {
	Integer arg1;
	Integer arg2;
	Integer result;
	
	public SophisticatedDivisor(Integer arg1, Integer arg2) {
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.result = arg1 / arg2;
	}

}
