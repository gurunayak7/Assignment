package com.training.scan;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a sentence: ");
		String sentence = scanner.nextLine();

		String[] words = sentence.split("\\s+");
		String longestWord = "";

		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}

		System.out.println("The longest word in the sentence is: " + longestWord);

		scanner.close();
	}
}
