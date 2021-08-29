package com.bridgelabz.testmaximum;

public class FindMaximum {

	public static void main(String[] args) {
		TestmaximumsIF testmaximums = new TestMaximumsImpl();
		Float firstFloat = (float) 5.0;
		Float secondFloat = (float) 5.1;
		Float thirdFloat = (float) 5.5;
		testmaximums.findFloatMaximum(firstFloat, secondFloat, thirdFloat);
	}

}
