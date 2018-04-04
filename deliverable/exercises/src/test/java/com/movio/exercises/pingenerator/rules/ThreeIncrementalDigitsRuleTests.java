package com.xxx.exercises.pingenerator.rules;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ThreeIncrementalDigitsRuleTests {

	@Test
	public void pinMustNotHaveThreeIncrementalDigitsTest() {
		
		ThreeIncrementalDigitsRule rule = new ThreeIncrementalDigitsRule(4);
		
		assertTrue(rule.apply(1)); // pin '1' represent '0001'
		assertTrue(rule.apply(1000));
		assertFalse(rule.apply(1231));
		assertFalse(rule.apply(567));
		assertTrue(rule.apply(1058));
		assertTrue(rule.apply(2658));
	}
}
