package com.xxx.exercises.pingenerator.rules;

public class TwoSameDigitsRule extends PinRule{

	String format_size;
	
	public TwoSameDigitsRule(int size) {
		format_size = "%0"+String.valueOf(size)+"d";
	}
	
	@Override
	public boolean apply(int pin) {
		
		// I considered that int '92' represents the pin 0092
		String formatted = String.format(format_size, pin);
		
		for(int i = 0; i < formatted.length() - 1; i++) {
			char prev_char = formatted.charAt(i);
			char pos_char = formatted.charAt(i+1);
			
			if(prev_char == pos_char) return false;
		}
		
		return true;		
	}
}
