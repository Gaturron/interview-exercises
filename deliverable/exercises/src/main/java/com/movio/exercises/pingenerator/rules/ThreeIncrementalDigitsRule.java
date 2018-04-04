package com.xxx.exercises.pingenerator.rules;

public class ThreeIncrementalDigitsRule extends PinRule{

	String format_size;
	
	public ThreeIncrementalDigitsRule(int size) {
		format_size = "%0"+String.valueOf(size)+"d";
	}
	
	@Override
	public boolean apply(int pin) {		

		String formatted = String.format(format_size, pin);
		
		for(int i = 0; i < formatted.length() - 2; i++) {
			int first_digit = Integer.valueOf(formatted.substring(i, i+1));
			int second_digit = Integer.valueOf(formatted.substring(i+1, i+2));
			int third_digit = Integer.valueOf(formatted.substring(i+2, i+3));
			
			if(first_digit+1 == second_digit && second_digit+1 == third_digit) return false;
		}
		return true;
	}
}
