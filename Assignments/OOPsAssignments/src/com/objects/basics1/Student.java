package com.objects.basics1;

public class Student {
	private String name;
	private String department;

	public Student(String name, String department) {
		this.name = name;
		this.department = department;
	}

	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Department: " + department);
	}
}
