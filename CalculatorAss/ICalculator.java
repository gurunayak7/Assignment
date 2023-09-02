package com.inter.extend;

public interface ICalculator {
	
	void add(int x, int y);
	void divide(int x, int y);
	void multiply(int x,int y);
	
	//functionality using default method
	default void difference(int x,int y) {
		System.out.println("Diff"+(x-y));
	}
	
}
