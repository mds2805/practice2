package com.dss.ex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalciTest {
	Calci c = new Calci();

	@Test
	void test() {

		int exptd = 2+2;
		int actual = c.add(2, 2);
		assertEquals(exptd, actual);

	}
	@Test
	void test2() {
		
		double exptd = 3.144*15.00;
		double actual = c.giveArea(15.00);
		assertEquals(exptd, actual,"the test is fail");			
	}
}
