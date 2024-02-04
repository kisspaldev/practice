package com.pali.second_larges_number_finder;

public class SecondLargesNumberFinder {

	private Integer max;
	private Integer secondMax;
	
	public Integer findSecondLargestNumber(int[] inputIntegers) throws Exception {
		if (inputIntegers == null ||
			inputIntegers.length == 0) {
			throw new Exception("Absent inputIntegers array!");
		}
		else {
			if (inputIntegers.length == 1) {
				return inputIntegers[0];
			}
			else {
				for(int i = 0; i < inputIntegers.length; i++) {
					process(inputIntegers[i]);
				}
			}
		}
				
		return secondMax;
	}
	
	private void process(int curValue) {
		if (max == null) {
			max = curValue;
		}
		else {
			if (max > curValue) {
				if (secondMax == null ||
					secondMax < curValue) {
					secondMax = curValue;
				}				
			}
			else {
				secondMax = max;
				max = curValue;	
			}			
		}						
	}	
	
}
