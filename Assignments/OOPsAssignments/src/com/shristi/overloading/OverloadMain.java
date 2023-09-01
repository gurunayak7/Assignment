package com.shristi.overloading;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee designation (Manager, Programmer, Director): ");
        String designation = scanner.nextLine();

        Employee employee = new Employee(name, designation);

        double bonus;
        if ("Programmer".equalsIgnoreCase(employee.getDesignation())) {
            System.out.print("Enter basic allowance: ");
            double basicAllowance = scanner.nextDouble();
            bonus = employee.calcBonus(basicAllowance);
        } else if ("Manager".equalsIgnoreCase(employee.getDesignation())) {
            System.out.print("Enter basic allowance: ");
            double basicAllowance = scanner.nextDouble();
            System.out.print("Enter car allowance: ");
            double carAllowance = scanner.nextDouble();
            bonus = employee.calcBonus(basicAllowance, carAllowance);
        } else if ("Director".equalsIgnoreCase(employee.getDesignation())) {
            System.out.print("Enter basic allowance: ");
            double basicAllowance = scanner.nextDouble();
            System.out.print("Enter car allowance: ");
            double carAllowance = scanner.nextDouble();
            System.out.print("Enter housing allowance: ");
            double housingAllowance = scanner.nextDouble();
            bonus = employee.calcBonus(basicAllowance, carAllowance, housingAllowance);
        } else {
            System.out.println("Invalid designation.");
            return;
        }

        System.out.println("Bonus for " + employee.getDesignation() + " " + employee.getName() + ": " + bonus);

        scanner.close();
	}

}
