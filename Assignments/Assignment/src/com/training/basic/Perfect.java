package com.training.basic;

public class Perfect {
	public static void main(String[] args) {
        int number = 6;
        
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }

    public static boolean isPerfectNumber(int n) {
        if (n <= 0) {
            return false;
        }

        int sumOfDivisors = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sumOfDivisors += i;
            }
        }

        return sumOfDivisors == n;
    }
}

