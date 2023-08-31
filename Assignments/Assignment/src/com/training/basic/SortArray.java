package com.training.basic;

import java.util.Arrays;

public class SortArray {
	public static void main(String[] args) {
		int[] numbers = { 7, 1, 5, 7, 2, 8 };

		Arrays.sort(numbers);

		System.out.println("Sorted Array:");
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
