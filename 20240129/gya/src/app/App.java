package app;


public class App {
	    public static void main(String[] args) throws Exception {
	        System.out.println("Digit Sum");
	        System.out.println("");
	        long input =25;
	        System.out.println("digit_sum("+input+")= "+digit_sum(input)); //7

	        input =55868;
	        System.out.println("digit_sum("+input+")= "+digit_sum(input)); //5
	        
	        input =1215;
	        System.out.println("digit_sum("+input+")= "+digit_sum(input)); //9
	        
	        input =999999999993L;
	        System.out.println("digit_sum("+input+")= "+digit_sum(input)); //3
	        
	        input =8;
	        System.out.println("digit_sum("+input+")= "+digit_sum(input)); //8
	        
	        input =0;
	        System.out.println("digit_sum("+input+")= "+digit_sum(input)); //0
	        
	        input =10;
	        System.out.println("digit_sum("+input+")= "+digit_sum(input)); //1
	        
	        input =-1234;
	        System.out.println("digit_sum("+input+")= "+digit_sum(input)); //0

	    }

	    private static int digit_sum(long input) {
	    	if (input < 0) {
	    		return 0;
	    	}else if (input >= 0 && input < 10) {
	    		return (int) input;
	    	}else {
	    		double thelog = Math.log10(input);
	    		int decimals = (int) Math.floor(thelog);
	    		int sum = 0;
	    		for (int p = decimals; p >= 0; p--) {
	    			int helyiertek = (int) Math.floor(input / Math.pow(10, p));
	    			sum += helyiertek;
	    			//System.out.println("Ciklus, p: "+p+"   helyiertek=   "+helyiertek+"    sum="+sum+"  work_input="+work_input);
	    			input -=(helyiertek*Math.pow(10, p));
	    		}
	    		return digit_sum(sum);
	    	}
	    }
}
