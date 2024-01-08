public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Palindrom");

        System.out.println(is_palindrome("alma"));  //false
        System.out.println(is_palindrome("halma")); //false
        System.out.println(is_palindrome("ababa")); //true
        System.out.println(is_palindrome("abba"));  //true
        System.out.println(is_palindrome("bab"));   //true
        System.out.println(is_palindrome("ba"));    //false
        System.out.println(is_palindrome("bb"));    //true
        System.out.println(is_palindrome("a"));     //true
        System.out.println(is_palindrome(""));      //true
        System.out.println(is_palindrome(null));   //false
    }


    private static boolean is_palindrome(String text){
        if(text == null) {  
            return false;
        }else{
            if (text.length() < 2){ 
                return true;
            }else{ 
                char eleje = text.charAt(0);
                char vege = text.charAt(text.length()-1);
                if (eleje == vege) { 
                    String kozepe = text.substring(1, text.length()-1);
                    return is_palindrome(kozepe);
                }else{
                    return false;
                }   
            }
        }
    }


}
