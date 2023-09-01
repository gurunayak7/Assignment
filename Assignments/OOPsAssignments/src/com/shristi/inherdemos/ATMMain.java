package com.shristi.inherdemos;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        Account account;

        System.out.println("Select Account Type:");
        System.out.println("1. Savings");
        System.out.println("2. Current");
        int choice = scanner.nextInt();

        if (choice == 1) {
            account = new Savings(balance);
        } else if (choice == 2) {
            account = new Current(balance);
        } else {
            System.out.println("Invalid choice.");
            scanner.close();
            return;
        }

        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
	}

}
