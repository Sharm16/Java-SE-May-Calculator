package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addtest() {
		Calculator cal= new Calculator();
		int actualValue = cal.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	@Test
	public void subtracttest() {
		Calculator cal= new Calculator();
		int actualValue = cal.subtract(2, 2);
		Assert.assertEquals(0, actualValue);
	}
	@Test
	public void multiplytest() {
		Calculator cal= new Calculator();
		int actualValue = cal.multiply(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	@Test
	public void dividetest() {
		Calculator cal= new Calculator();
		double actualValue = cal.divide(2, 2);
		Assert.assertEquals(1.0, actualValue,0.001);
		double actualValue2 = cal.divide(2, 0);
		Assert.assertEquals(0.0, actualValue2,0.001);
	}

	
}
