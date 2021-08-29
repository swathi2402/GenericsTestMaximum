package com.bridgelabz.testmaximum;

import java.lang.Integer;

public class FindMaximum {

	public static void main(String[] args) {
		TestmaximumsIF testmaximums = new TestMaximumsImpl();
		Integer firstFloat = 50;
		Integer secondFloat = 40;
		Integer thirdFloat = 30;
		testmaximums.findIntMaximum(firstFloat, secondFloat, thirdFloat);
	}

}
