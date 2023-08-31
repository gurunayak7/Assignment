package com.training.scan;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String[] usernames = { "user1", "user2", "user3" };

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter username to login: ");
		String inputUsername = scanner.nextLine();

		boolean isValid = false;

		for (String username : usernames) {
			if (username.equals(inputUsername)) {
				isValid = true;
				break;
			}
		}

		if (isValid) {
			System.out.println("You are logged in successfully.");
		} else {
			System.out.println("Invalid username.");
		}

		scanner.close();
	}
}
