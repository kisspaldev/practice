package com.pali.second_larges_number_finder;

import java.util.Arrays;

public class SecondLargestNumberFinderPractice {

	public static void main(String[] args) {
		NumberGenerator ng = new NumberGenerator();		
		int[] randomNumbers = ng.generate(10);
		
		System.out.println("Numbers: " + Arrays.toString(randomNumbers));
		
		SecondLargesNumberFinder slnf = new SecondLargesNumberFinder();
		
		try {
			System.out.println("Second max: " + slnf.findSecondLargestNumber(randomNumbers));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
