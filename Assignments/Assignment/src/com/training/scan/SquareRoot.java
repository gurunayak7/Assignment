package com.training.scan;

import java.util.Scanner;

public class SquareRoot {
	public class ArraySquareRoot {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of elements in the array: ");
	        int n = scanner.nextInt();
	        
	        double[] arr = new double[n];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextDouble();
	        }
	        
	        double[] sqrtArr = new double[n];
	        
	        for (int i = 0; i < n; i++) {
	            sqrtArr[i] = Math.sqrt(arr[i]);
	        }
	        
	        System.out.println("Square roots of elements:");
	        for (double num : sqrtArr) {
	            System.out.println(num);
	        }
	        
	        scanner.close();
	    }
	}
}
