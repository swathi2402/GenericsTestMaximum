package com.bridgelabz.testmaximum;

public class FindMaximum {

	public static void main(String[] args) {
		String firstString = "Apple";
		String secondString = "Peach";
		String thirdString = "Banana";
		Integer firstInteger = 50;
		Integer secondInteger = 40;
		Integer thirdInteger = 30;
		Float firstFloat = (float) 5.0;
		Float secondFloat = (float) 5.1;
		Float thirdFloat = (float) 5.5;
		TestMaximumsImpl.findMaximum(firstString, secondString, thirdString);
		TestMaximumsImpl.findMaximum(firstInteger, secondInteger, thirdInteger);
		TestMaximumsImpl.findMaximum(firstFloat, secondFloat, thirdFloat);
	}

}
