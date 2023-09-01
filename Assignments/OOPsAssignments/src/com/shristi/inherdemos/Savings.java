package com.shristi.inherdemos;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Savings Withdrawn: " + amount);
		} else {
			System.out.println("Savings Withdrawal failed. Insufficient balance.");
		}
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Savings Deposited: " + amount);
		} else {
			System.out.println("Savings Deposit failed. Invalid amount.");
		}

	}
}
