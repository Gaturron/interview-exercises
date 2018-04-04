package com.xxx.exercises.exercise1;

import java.util.Arrays;

public class Exercise1Application {

	public static void main(String[] args) {
		System.out.println("Hello exercise 1");
		
		int[] a = {1,1,3,5};
		int[] b = {1,2,3,4};
		int[] res = MergeFunctions.merge(a, b);
		System.out.println(Arrays.toString(res));
	}
}
