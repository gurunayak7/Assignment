package com.shristi.inherdemos;

public class Current extends Account {

	public Current(double balance) {
		super(balance);

	}

	@Override
	public void withdraw(double amount) {
		if (amount > 0) {
			balance -= amount;
			System.out.println("Current Withdrawn: " + amount);
		} else {
			System.out.println("Current Withdrawal failed. Invalid amount.");
		}
	}

	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Current Deposited: " + amount);
		} else {
			System.out.println("Current Deposit failed. Invalid amount.");
		}
	}
}
