package com.training.basic;

public class Greater {

	public static void main(String[] args) {
		int[] numbers = { 1, 20, 3, 40, 50 };

		int maximum = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maximum) {
				maximum = numbers[i];
			}
		}

		System.out.println("The maximum value in the array is: " + maximum);
	}

}
