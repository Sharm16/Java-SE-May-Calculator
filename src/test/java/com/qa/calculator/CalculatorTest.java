package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addtest() {
		Calculator cal= new Calculator();
		int actualValue = cal.add(2, 2);
		Assert.assertEquals(4, actualValue);
		int actualValue2 = cal.add(2, -2);
		Assert.assertEquals(0, actualValue2);
	
	}
	@Test
	public void subtracttest() {
		Calculator cal= new Calculator();
		int actualValue = cal.subtract(2, 2);
		Assert.assertEquals(0, actualValue);
		int actualValue2 = cal.subtract(2, -2);
		Assert.assertEquals(4, actualValue2);
	}
	@Test
	public void multiplytest() {
		Calculator cal= new Calculator();
		int actualValue = cal.multiply(2, 2);
		Assert.assertEquals(4, actualValue);
		int actualValue2 = cal.multiply(-2, 2);
		Assert.assertEquals(-4, actualValue2);
		int actualValue3 = cal.multiply(0, 2);
		Assert.assertEquals(0, actualValue3);
	}
	@Test
	public void dividetest() {
		Calculator cal= new Calculator();
		double actualValue = cal.divide(2, 2);
		Assert.assertEquals(1.0, actualValue,0.001);
		double actualValue2 = cal.divide(2, 0);
		Assert.assertEquals(0.0, actualValue2,0.001);
		double actualValue3 = cal.divide(-10, 5);
		Assert.assertEquals(-2, actualValue3, 0.0001);
	}

	
}
