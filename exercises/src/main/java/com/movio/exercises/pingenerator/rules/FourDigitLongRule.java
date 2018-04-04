package com.xxx.exercises.pingenerator.rules;

public class FourDigitLongRule extends PinRule{

	String format_size;
	
	public FourDigitLongRule(int size) {
		format_size = "%0"+String.valueOf(size)+"d";
	}
	
	@Override
	public boolean apply(int pin) {
		
		String formatted = String.format(format_size, pin);
		return formatted.length() == 4;
	}
}
