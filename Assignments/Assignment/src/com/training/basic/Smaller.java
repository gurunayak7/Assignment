package com.training.basic;

public class Smaller {

	public static void main(String[] args) {
		int[] numbers = { 1, 20, 3, 40, 50 };

		int min = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}

		System.out.println("The minimum value in the array is: " + min);

	}

}
