package com.objects.basics1;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter details for Student 1:");
		System.out.print("Name: ");
		String name1 = scanner.nextLine();
		System.out.print("Department: ");
		String department1 = scanner.nextLine();

		System.out.println("Enter marks for Student 1 (separated by spaces):");
		String[] marks1Input = scanner.nextLine().split(" ");
		int[] marks1 = new int[marks1Input.length];
		for (int i = 0; i < marks1Input.length; i++) {
			marks1[i] = Integer.parseInt(marks1Input[i]);
		}

		System.out.println("Enter details for Student 2:");
		System.out.print("Name: ");
		String name2 = scanner.nextLine();
		System.out.print("Department: ");
		String department2 = scanner.nextLine();

		System.out.println("Enter marks for Student 2 (separated by spaces):");
		String[] marks2Input = scanner.nextLine().split(" ");
		int[] marks2 = new int[marks2Input.length];
		for (int i = 0; i < marks2Input.length; i++) {
			marks2[i] = Integer.parseInt(marks2Input[i]);
		}

		Student student1 = new Student(name1, department1);
		Student student2 = new Student(name2, department2);

		System.out.println("\nStudent 1 Details:");
		student1.printDetails();
		System.out.println("Grade: " + GradeSystem.getGrades(marks1));

		System.out.println("\nStudent 2 Details:");
		student2.printDetails();
		System.out.println("Grade: " + GradeSystem.getGrades(marks2));

		scanner.close();
	}
}
