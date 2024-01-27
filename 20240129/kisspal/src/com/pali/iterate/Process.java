package com.pali.iterate;

public class Process {
	private int maxIntNumber = 99;
	private int minIntNumber = 10;
	
	private int getNumber(int value, boolean right) {
		if (right) {
			return value % 10;
		}
		else {
			return value / 10;	
		}
	}
	
	private boolean endProcess(int curValue) {
		if (addDigits(curValue) < 10) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private int addDigits(int curValue) {
		return getNumber(curValue, true) + getNumber(curValue, false);
	}
	
	private boolean acceptNumber(int intValue) {
		return intValue <= maxIntNumber && intValue >= minIntNumber;
	}
	
	public void check(int inputValue) throws Exception {
		if (!acceptNumber(inputValue)) {
			throw new Exception("Wrong number, a Accept 10-99!");
		}
		
		System.out.println(getNumber(inputValue, false) + " + " + getNumber(inputValue, true) + " = " + addDigits(inputValue));
		
		if (endProcess(inputValue)) {
			System.out.println("Final: " + addDigits(inputValue));
		}
		else {
			check(addDigits(inputValue));
		}
		
	}
	
}
