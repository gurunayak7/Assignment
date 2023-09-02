package com.training.quest1;

import java.util.Arrays;
import java.util.List;

public class ListD {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Guru", 777, "Bangalore"),
				new Employee("Prasad", 707, "Mysore"), new Employee("Nayak", 070, "Manglore"),
				new Employee("Sham", 101, "Ujjire"), new Employee("Vivek", 107, "Bangalore"));
		for (Employee employee : employees) {
			// System.out.println(employee.getEmployeeID()+" : "+employee.getName());
			if (employee.getCity().equals("Bangalore")) {
				System.out.println(employee.getEmployeeID() + " : " + employee.getName());
			}
		}
	}

}
