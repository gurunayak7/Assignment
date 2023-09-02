package com.inter.extend;

public class CalculatorMain {

	public static void main(String[] args) {
		ICalculator calculator=new BasicCalculator();
		calculator.add(10, 20);
		calculator.multiply(3, 2);
		calculator.difference(3, 2);
		
		
		Scientific scint=new ScientificCal();
		scint.cube(4);
		scint.add(10, 20);
		scint.multiply(3, 2);
		scint.square(4);
		
		
	}

}
