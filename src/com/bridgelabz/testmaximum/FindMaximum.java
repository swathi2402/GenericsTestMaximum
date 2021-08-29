package com.bridgelabz.testmaximum;

import java.lang.Integer;

public class FindMaximum {

	public static void main(String[] args) {
		TestmaximumsIF testmaximums = new TestMaximumsImpl();
		Integer firstInteger = 50;
		Integer secondInteger = 40;
		Integer thirdInteger = 30;
		testmaximums.findIntMaximum(firstInteger, secondInteger, thirdInteger);
	}

}
