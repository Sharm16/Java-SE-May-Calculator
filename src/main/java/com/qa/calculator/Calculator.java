package com.qa.calculator;

public class Calculator {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.divide(2, 0));
	}

	public int add(int i, int j) {
		Add a = new Add();
		return a.add(j, j);
	}

	public int subtract(int i, int j) {
		Subtract s = new Subtract();
		return s.subtract(j, j);
	}

	public int multiply(int i, int j) {
		Multiply m = new Multiply();
		return m.multiply(j, j);
	}

	public double divide(double i, double j) {
		Divide d = new Divide();
		return d.divide(j, j);
	}
}
