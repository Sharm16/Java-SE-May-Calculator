package com.qa.calculator;

public class Divide {
	public double divide(double num1, double num2) {

		if (num1 == 0 || num2 == 0) {
			return 0;
		} 
//		else if (num1<0 && num2 <0) {
//			return num1 / num2;
//		}
//		else if (num1<0 ) {
//			double negNum1=num1*(-1);
//			(negNum1 / num2);
//			
//		}
//		else if (num2 <0) {
//			return -(num1 / num2);
//		}
//		else {
			return num1 / num2;
		}
	}

