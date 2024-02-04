package com.pali.second_larges_number_finder;

import java.util.Random;

public class NumberGenerator {
	private static final int INTERVAL_LOW = 1;
	private static final int INTERVAL_HIGH = 100;
	private Random rnd;

	public NumberGenerator()
	{
		rnd = new Random();
	}
	
	private int getRandomInt() {
		return rnd.nextInt(INTERVAL_HIGH-INTERVAL_LOW) + INTERVAL_LOW;
	}
	
	public int[] generate(int count) {
		int[] result = new int[count];
		
		for(int i = 0; i < count; i++) {
			result[i] = getRandomInt();
		}
		
		return result;
	}
	
}
