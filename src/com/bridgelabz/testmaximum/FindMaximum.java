package com.bridgelabz.testmaximum;

public class FindMaximum {

	public static void main(String[] args) {
		TestmaximumsIF testmaximums = new TestMaximumsImpl();
		String firstString = "Apple";
		String secondString = "Peach";
		String thirdString = "Banana";
		testmaximums.findStringMaximum(firstString, secondString, thirdString);
	}

}
