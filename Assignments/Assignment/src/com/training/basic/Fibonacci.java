package com.training.basic;

public class Fibonacci {

	public static void main(String[] args) {
		int number = 10;
        int first = 0, second = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= number; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
	}

}
