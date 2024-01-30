package app;


public class App {
	    public static void main(String[] args) throws Exception {
	        System.out.println("Second Max");
	        System.out.println("");
	        long input =25;
	        System.out.println(second_max(new int[]{ 9,10,1,2,3,4,5,6,7,8 })); //9
	        
	        System.out.println(second_max(new int[]{ 10,9,1,2,3,4,5,6,7,8 })); //9
	        
	        System.out.println(second_max(new int[]{ 1,2,3,10,9,4,5,6,7,8 })); //9
	        
	        System.out.println(second_max(new int[]{ 1,2,3,4,9,10,5,6,7,8 })); //9
	        
	        System.out.println(second_max(new int[]{ 1,2,3,4,5,6,7,8,9,10 })); //9
	        
	        System.out.println(second_max(new int[]{ 1,2,3,4,5,6,7,8,10,9 })); //9
	        
	        System.out.println(second_max(new int[]{ 1,2,3,9,4,5,6,7,8,10 })); //9
	        
	        System.out.println(second_max(new int[]{ 1,2,3,10,4,5,6,7,8,9 })); //9

	        System.out.println(second_max(new int[]{10,9 })); //9
	        
	        System.out.println(second_max(new int[]{9,10 })); //9
	        
	        System.out.println(second_max(new int[]{9})); //9
	        
	        System.out.println(second_max(new int[]{})); //-2147483648

	    }

	    private static int second_max(int[] arr) {
	    	int max1 = Integer.MIN_VALUE;
	    	int max2 = Integer.MIN_VALUE;
	    	
	    	if(arr.length > 0) {
	    		max1 = arr[0];
	    		max2 = arr[0];
	    	}
	    	
	    	for (int a: arr) {
	    		if ((max1 == max2) && (a < max2)) {
		    			max2 = a;
		    	} else if (a > max1) {
	    			max2 = max1;
	    			max1 = a;
	    		}else if (a > max2) {
	    			max2 = a;

	    		}
	    	}
	    	return max2;
	    }
}
