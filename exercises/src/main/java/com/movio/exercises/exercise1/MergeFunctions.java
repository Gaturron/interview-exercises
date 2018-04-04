package com.xxx.exercises.exercise1;

import java.util.Arrays;

public class MergeFunctions {

	public static int[] merge(int[] a, int[] b) {
		
		if (a == null && b == null) return null;
		if (a == null || a.length == 0) return Arrays.copyOf(b, b.length);
		if (b == null || b.length == 0) return Arrays.copyOf(a, a.length);
		
		int[] result = new int[a.length+b.length];
		int result_index = 0;
		
		int a_index = 0;
		int b_index = 0;
		
		while(a_index < a.length && b_index < b.length) {
			
			if(a[a_index] < b[b_index]){
				result[result_index] = a[a_index];
				a_index++;
				
			}else{
				result[result_index] = b[b_index];
				b_index++;
			}
			result_index++;
		}
		
		while(a_index < a.length){
			result[result_index] = a[a_index];
			a_index++;
		}
		
		while(b_index < b.length){
			result[result_index] = b[b_index];
			b_index++;
		}
		
		return result;
	}
}
