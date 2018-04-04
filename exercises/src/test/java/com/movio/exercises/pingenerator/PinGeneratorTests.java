package com.xxx.exercises.pingenerator;

import static org.junit.Assert.assertTrue;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class PinGeneratorTests {

	@Test
	public void generateBatchMustGenerate1000PinsTest() throws NoSuchAlgorithmException {
		
		PinGenerator generator = new PinGenerator();
		String[] res = generator.generateBatch();
		
		assertTrue(res.length == 1000);
	}
	
	@Test
	public void generateBatchMustGiveUniquePinsTest() throws NoSuchAlgorithmException {
		
		PinGenerator generator = new PinGenerator();
		String[] res = generator.generateBatch();
		
		Set<String> set = new HashSet<String>();
		set.addAll(Arrays.asList(res));
		assertTrue(set.size() == 1000);	
	}			
}
