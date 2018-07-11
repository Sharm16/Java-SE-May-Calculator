package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addtest() {
		Add a = new Add();
		int actualValue = a.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	@Test
	public void subtracttest() {
		Subtract s = new Subtract();
		int actualValue = s.subtract(2, 2);
		Assert.assertEquals(0, actualValue);
	}
	@Test
	public void multiplytest() {
		Multiply m =new Multiply();
		int actualValue = m.multiply(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	@Test
	public void dividetest() {
		Divide d = new Divide();
		int actualValue = d.divide(0, 2);
		Assert.assertEquals(0, actualValue);
	}

	
}
