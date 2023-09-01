package com.shristi.inherdemos;

public abstract class Bank {
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	public abstract void withdraw(double amount);

    public abstract void deposit(double amount);

    public double getBalance() {
        return balance;
    }
}
