package com.xxx.exercises.exercise2;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import com.xxx.exercises.pingenerator.PinGenerator;

public class Exercise2Application {

	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		System.out.println("Hello exercise 2");
		
		PinGenerator generator = new PinGenerator();
		
		String string_batch = Arrays.toString(generator.generateBatch());
		System.out.println(string_batch);		
	}
}
