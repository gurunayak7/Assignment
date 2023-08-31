package com.objects.basics;

public class Book {
    private String title;
    private String author;
    private double price;
    private String category;

    public Book(String title, String author, double price, String category) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
    }

    public void getDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
        checkBookType();
        System.out.println();
    }

    private void checkBookType() {
        if (price > 500) {
            System.out.println("Type: Premium Book");
        } else {
            System.out.println("Type: Standard Book");
        }
    }
}
