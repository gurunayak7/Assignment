package com.shristi.inherdemos;

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: " + amount);
		} else {
			System.out.println("Withdrawal failed. Insufficient balance.");
		}
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Deposit failed. Invalid amount.");
		}
	}

	public double getBalance() {
		return balance;
	}
}
