package com.shristi.overloading;

public class Employee {
	private String name;
	private String designation;
	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}
	public double calcBonus(double basicAllowance) {
        return basicAllowance * 0.1;
    }

    public double calcBonus(double basicAllowance, double carAllowance) {
        return (basicAllowance + carAllowance) * 0.1;
    }

    public double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
        return (basicAllowance + carAllowance + houseAllowance) * 0.1;
    }
    public String getDesignation() {
        return designation;
    }
	public String getName() {
		return name;
	}
}
