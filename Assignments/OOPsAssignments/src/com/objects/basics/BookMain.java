package com.objects.basics;

public class BookMain {
	public static void main(String[] args) {
		Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", 12.99, "Fiction");
		Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 599.99, "Classic");

		System.out.println("Book 1 Details:");
		book1.getDetails();

		System.out.println("Book 2 Details:");
		book2.getDetails();
	}
}
