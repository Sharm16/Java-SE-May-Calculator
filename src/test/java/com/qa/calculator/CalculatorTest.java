package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addtest() {
		Calculator calc = new Calculator();
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	@Test
	public void subtracttest() {
		Calculator calc = new Calculator();
		int actualValue = calc.subtract(2, 2);
		Assert.assertEquals(0, actualValue);
	}
	@Test
	public void multiplytest() {
		Calculator calc = new Calculator();
		int actualValue = calc.multiply(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	@Test
	public void dividetest() {
		Calculator calc = new Calculator();
		int actualValue = calc.divide(0, 2);
		Assert.assertEquals(0, actualValue);
	}

	
}
