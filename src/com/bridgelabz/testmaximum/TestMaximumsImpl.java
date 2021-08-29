package com.bridgelabz.testmaximum;

public class TestMaximumsImpl implements TestmaximumsIF {

	@Override
	public void findIntMaximum(Integer firstInteger, Integer secondInteger, Integer thirdInteger) {
		Integer LargestIntNumber = firstInteger;
		if (secondInteger.compareTo(LargestIntNumber) > 0) {
			LargestIntNumber = secondInteger;
		}
		if (thirdInteger.compareTo(LargestIntNumber) > 0) {
			LargestIntNumber = thirdInteger;
		}

		System.out.println("Largest Interger is: " + LargestIntNumber);
	}

	@Override
	public void findFloatMaximum(Float firstFloat, Float secondFloat, Float thirdFloat) {
		Float LargestFloatNumber = firstFloat;
		if (secondFloat.compareTo(LargestFloatNumber) > 0) {
			LargestFloatNumber = secondFloat;
		}
		if (thirdFloat.compareTo(LargestFloatNumber) > 0) {
			LargestFloatNumber = thirdFloat;
		}

		System.out.println("Largest Float is: " + LargestFloatNumber);
		
	}

	@Override
	public void findStringMaximum(String firstString, String secondString, String thirdString) {
		String LargestString = firstString;
		if (secondString.compareTo(LargestString) > 0) {
			LargestString = secondString;
		}
		if (thirdString.compareTo(LargestString) > 0) {
			LargestString = thirdString;
		}

		System.out.println("Largest Float is: " + LargestString);
		
	}

}
