package com.bridgelabz.testmaximum;

public class TestMaximumsImpl<T extends Comparable<T>> {

	T firstInput, secondInput, thirdInput;

	public TestMaximumsImpl(T firstInput, T secondInput, T thirdInput) {
		super();
		this.firstInput = firstInput;
		this.secondInput = secondInput;
		this.thirdInput = thirdInput;
	}

	public static <T extends Comparable<T>> void findMaximum(T firstInput, T secondInput, T thirdInput) {
		T LargestInput = firstInput;
		if (secondInput.compareTo(LargestInput) > 0) {
			LargestInput = secondInput;
		}
		if (secondInput.compareTo(LargestInput) > 0) {
			LargestInput = secondInput;
		}

		System.out.println("Largest among the three is: " + LargestInput);

	}
}
