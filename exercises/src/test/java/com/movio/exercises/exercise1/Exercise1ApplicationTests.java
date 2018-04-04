package com.xxx.exercises.exercise1;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class Exercise1ApplicationTests {

	@Test
	public void bothListNull() {
		int[] res = MergeFunctions.merge(null, null);
		assertArrayEquals(res, null);
	}

	@Test
	public void oneListNull() {
		
		int[] a = {1,2,3};
				
		int[] res = MergeFunctions.merge(a, null);
		assertArrayEquals(res, a);
		
		res = MergeFunctions.merge(null, a);
		assertArrayEquals(res, a);
	}
	
	@Test
	public void oneListEmpty() {
		
		int[] a = {1,2,3};
		int[] b = {};
		
		int[] res = MergeFunctions.merge(a, b);
		assertArrayEquals(res, a);
		
		res = MergeFunctions.merge(b, a);
		assertArrayEquals(res, a);
	}
	
	@Test
	public void sameListTest() {
		
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		int[] res = MergeFunctions.merge(a, b);
		
		int[] correct_res = new int[] { 1, 1, 2, 2, 3, 3 };
		assertArrayEquals(res, correct_res);
	}
		
	@Test
	public void exampleTest() {
		
		int[] a = {1,1,3,5};
		int[] b = {1,2,3,4};
		int[] res = MergeFunctions.merge(a, b);
		
		int[] correct_res = new int[] { 1, 1, 1, 2, 3, 3, 4, 5};
		assertArrayEquals(res, correct_res);
	}
}
