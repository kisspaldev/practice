
public class PalindromeUtilities {

    public boolean isPalindrome(String inputValue) {
    	if (inputValue == null ||
    		inputValue.length() == 1) {
    		return false;
    	}
    	else {
    		return checkPalindrome(0, inputValue);
    	}    	            
    }

    private boolean checkPalindrome(int idx, String inputValue) {
            if (idx == (inputValue.length() / 2)) {
                    return true;
            }
            else {
                    char beginChar = inputValue.charAt(idx);
                    char endChar = inputValue.charAt(inputValue.length() - idx -1);
                    
                    if (beginChar == endChar) {
                            return checkPalindrome(idx + 1, inputValue);
                    }
                    else {
                            return false;
                    }
           }
    }

}
