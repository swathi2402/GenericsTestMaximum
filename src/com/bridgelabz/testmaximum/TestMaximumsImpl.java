package com.bridgelabz.testmaximum;

public class TestMaximumsImpl implements TestmaximumsIF {

	@Override
	public void findIntMaximum(Integer firstInteger, Integer secondInteger, Integer thirdInteger) {
		Integer LargestNumber = firstInteger;
		if (secondInteger.compareTo(LargestNumber) > 0) {
			LargestNumber = secondInteger;
		}
		if (thirdInteger.compareTo(LargestNumber) > 0) {
			LargestNumber = thirdInteger;
		}

		System.out.println("Largest Interger is: " + LargestNumber);
	}

}
