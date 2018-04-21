package org.careercon2018.examples.example1;

import java.util.LinkedList;
import java.util.List;

import lombok.Getter;

@Getter
public class SampleObject {
	Integer squareInput;
	List<Integer> numbers;
	String name;
	
	public SampleObject(Integer input) {
		this.squareInput = input * input;
		this.name = input.toString();
		numbers = new LinkedList<>();
		for (int i=0; i < input.intValue() - 1 ;i++) {
			numbers.add(i);
		}
	}
	
	public int getNumbersSize() {
		return this.numbers.size();
	}
}
