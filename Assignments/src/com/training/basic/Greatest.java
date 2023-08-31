package com.training.basic;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		int[] arr=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int max=arr[0];
				if(arr[i]>max) {
				max=max+1;
				}
				
		System.out.println(max);
		}

	}


}
