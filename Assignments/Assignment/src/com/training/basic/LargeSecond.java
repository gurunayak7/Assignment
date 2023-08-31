package com.training.basic;

import java.util.Arrays;

public class LargeSecond {

	public static void main(String[] args) {
		int array[] = { 11, 12, 13, 7, 0, 5 };
		int size = array.length;
		Arrays.sort(array);
		int res = array[size - 2];
		System.out.println("2nd largest element is ::" + res);
	}

}
