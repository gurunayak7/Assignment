package com.tarining.quest3;

public class MainShape {
	public static void main(String[] args) {
		Shape shape = (x, y) -> {
			System.out.println("Area of Rectangle " + (x * y));
		};
		shape.area(3, 4);

		shape = (x, y) -> {
			System.out.println("Area of Triangle " + (0.5 * x * y));
		};
		shape.area(5, 6);

		shape = (x, y) -> {
			System.out.println("Area of square " + (x * x));
		};
		shape.area(5, 0);

	}
}
