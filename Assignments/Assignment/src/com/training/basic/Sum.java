package com.training.basic;

public class Sum {

	public static void main(String[] args) {
		int[] numbers = { 11, 12, 13, 7, 0, 5 };

		int sum = 0;

		for (int number : numbers) {
			sum += number;
		}

		double average = (double)sum / numbers.length;

		System.out.println("Sum of all elements: " + sum);
		System.out.println("Average of all elements: " + average);
	}

}
