package com.training.scan;

import java.util.Scanner;

public class MaxOccurrenceOfLetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = scanner.nextLine();

		int[] letterCount = new int[26]; // Assuming we are dealing with lowercase English letters

		for (char c : word.toLowerCase().toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				letterCount[c - 'a']++;
			}
		}

		char maxOccurringLetter = 'a';
		int maxCount = 0;

		for (int i = 0; i < 26; i++) {
			if (letterCount[i] > maxCount) {
				maxCount = letterCount[i];
				maxOccurringLetter = (char) ('a' + i);
			}
		}

		System.out.println("The maximum occurring letter in the word is: " + maxOccurringLetter);
		System.out.println("It occurs " + maxCount + " times.");

		scanner.close();
	}
}
