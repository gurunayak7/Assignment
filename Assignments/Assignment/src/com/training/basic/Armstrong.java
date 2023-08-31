package com.training.basic;

public class Armstrong {

	public static void main(String[] args) {
		int number = 153;
		int temp = number;
		int power = 0;

		while (number > 0) {
			int reminder = number % 10;
			power = (power) + (reminder * reminder * reminder);
			number = number / 10;
		}

		if (temp == power) {
			System.out.println("It is Armstrong Number");
		} else {
			System.out.println("It is not an Armstrong Number");
		}
	}
}
