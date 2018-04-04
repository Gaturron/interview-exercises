package com.xxx.exercises.pingenerator.rules;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FourDigitLongRuleTests {

	@Test
	public void pinMustBeFourDigitLongTest() {
		
		FourDigitLongRule rule = new FourDigitLongRule(4);
		
		assertTrue(rule.apply(1)); // pin '1' represent '0001'
		assertTrue(rule.apply(1000));
		assertFalse(rule.apply(10000));
	}
}