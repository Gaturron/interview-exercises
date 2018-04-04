package com.xxx.exercises.pingenerator;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.xxx.exercises.pingenerator.rules.FourDigitLongRule;
import com.xxx.exercises.pingenerator.rules.PinRule;
import com.xxx.exercises.pingenerator.rules.ThreeIncrementalDigitsRule;
import com.xxx.exercises.pingenerator.rules.TwoSameDigitsRule;

public class PinGenerator {
	
	private static int PIN_SIZE = 4;
	
	SecureRandom secureRandom;
	List<PinRule> rules = new ArrayList<PinRule>();
	
	public PinGenerator() throws NoSuchAlgorithmException {
		
		secureRandom = SecureRandom.getInstance("SHA1PRNG");	
		
		rules.add(new FourDigitLongRule(PIN_SIZE));
		rules.add(new ThreeIncrementalDigitsRule(PIN_SIZE));
		rules.add(new TwoSameDigitsRule(PIN_SIZE));
	}

	public String[] generateBatch(){
		return generateBatch(1000);
	}
	
	private String[] generateBatch(int size){
		
		String[] batch = new String[size];
		Set<String> batch_set = new HashSet<String>();		
		
		int i = 0;
		while(i < batch.length){
			String format_size = "%0"+String.valueOf(PIN_SIZE)+"d";
			String formatted = String.format(format_size, generatePin());
			
			if(!batch_set.contains(formatted)){
				batch_set.add(formatted);
				batch[i] = formatted;
				i++;
			}
		}
		return batch;
	}
	
	private int generatePin() {
		
		int pin = 0;
		boolean res = false;
		
		while(!res) {
			pin = generateRandomInt();
			res = checkRules(pin);			
		}
		return pin;
	}	
	
	private boolean checkRules(int pin) {
		
		boolean res = true;
		for(PinRule rule : rules){
			res = res && rule.apply(pin);
		}
		return res;
	}
	
	private int generateRandomInt() {
		
		return secureRandom.nextInt((int) (Math.pow(10L, PIN_SIZE) - 1));
	}	
}
