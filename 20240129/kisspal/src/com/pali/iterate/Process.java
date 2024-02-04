package com.pali.iterate;

import java.util.concurrent.atomic.AtomicInteger;

public class Process {
	
	private static final int END_PROCESS_LIMIT = 10;

	private boolean endProcess(int curValue) {
		if (curValue < END_PROCESS_LIMIT) {
			return true;
		}
		else {
			return false;
		}
	}
		
	private int addDigits(int inputValue) {
		String inputStrValue = String.valueOf(inputValue);
		
		AtomicInteger result = new AtomicInteger(0);
		
		StringBuilder showValues = new StringBuilder();
		
		if (inputStrValue != null &&
			inputStrValue.length() != 0) {
			inputStrValue.chars().forEach( curChar -> {	
				showValues.append((char)curChar);
				showValues.append("+");
				
				result.addAndGet(Character.getNumericValue(curChar));
			});
		}

		if (showValues.length() != 0) {
			showValues.setLength(showValues.length() - 1);
			showValues.append("=");
			showValues.append(result);
			
			System.out.println(showValues);
		}
		
	
		return result.get();
	}
	
	public void check(int inputValue) throws Exception {
		int digitSum = addDigits(inputValue);
		
		if (!endProcess(digitSum)) {
			check(digitSum);
		}
		
	}
	
}
