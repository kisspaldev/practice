package com.pali.xmasstree;

public class XMassTreeGenerator {
	
	private final int BUSH_COUNT = 4;
	private final int MAX_WIDTH = BUSH_COUNT * 2 + 1;
	private final int MAX_ITEM_COUNT = ((BUSH_COUNT * (2 + BUSH_COUNT + 1)) / 2) * MAX_WIDTH; 
		
	private final String SPACE = " ";
	private final String MARKER = "X";
	
	public void generate() {
		System.out.println("max_width: " + MAX_WIDTH);
		System.out.println("max_item_count: " + MAX_ITEM_COUNT);
		System.out.println();
		
		int curLevel = 1;
		int curBush = 2;	
		int curColPos = 1;
		
		int middlePos = getMiddlePos();
		
		for(int curPos = 1; curPos <= MAX_ITEM_COUNT + middlePos; curPos++ ) {				
		
			if ((curColPos == middlePos) ||
				(curColPos > middlePos - curLevel &&
				 curColPos < middlePos + curLevel
						
						)) {
				System.out.print(MARKER);	
			}
			else {
				System.out.print(SPACE);
			}
			
			if (curPos % MAX_WIDTH == 0) {
				System.out.println("- curPos = " + curPos + "; curLevel = " + curLevel + "; curBush = " + curBush);
				
				curColPos = 1;
				
				if (curLevel == curBush) {
					curLevel = 1;
					curBush++;
				}
				else {
					curLevel++;	
				}					
				
			}	
			else {
				curColPos++;	
			}			
		}
	}

	private int getMiddlePos() {
		return MAX_WIDTH / 2 + 1;
	}
	

}
