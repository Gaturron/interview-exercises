package com.xxx.exercises.pingenerator.rules;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TwoSameDigitsRuleTests {
	
	@Test
	public void pinMustNotHaveTwoSameConsecutivesDigitsTest() {
		
		TwoSameDigitsRule rule = new TwoSameDigitsRule(4);
		
		assertFalse(rule.apply(1)); // pin '1' represent '0001'
		assertFalse(rule.apply(1000));
		assertTrue(rule.apply(1230));
		assertTrue(rule.apply(1683));		
		assertFalse(rule.apply(1156));
		assertTrue(rule.apply(1341));
		assertFalse(rule.apply(3441));
		assertFalse(rule.apply(3244));
		assertFalse(rule.apply(2244));
	}
}
