package app;

import java.util.HashMap;
import java.util.Map;

import counter.Ch_count_list;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("CharCounter");
        System.out.println("");
        String input ="To find the number of occurrences, loop through the string and search for that character at every iteration; whenever it is found, it will update the count";
        /* Els� megold�s */
        System.out.println(input);
        System.out.println(char_count(input));
        
        String input_null = null;
        System.out.println("");
        System.out.println("null input eset�n az eredm�ny:");
        System.out.println(char_count(input_null));
        System.out.println("---- E N D ----");
        System.out.println("");
        
        /* M�sodik OP megold�s*/
        System.out.println("---- Sp�ci OP megold�s ----");
        System.out.println(new Ch_count_list(input));
        System.out.println("---- E N D ----");
    }


    /**
     * Megsz�molja Case-sensitive m�dban az egyes karakterek sz�m�t az input texten bel�l.
     * @param text
     * @return Map<String,Long) vagy null
     */
    private static Map<String,Long> char_count(String text){
        if(text == null) {  
            return null;
        }else{
        	Map<String,Long> result = new HashMap<String,Long>();
        	String[] char_array = text.split("");
			for (String s : char_array) {
				if(result.containsKey(s)) {
					Long count = result.get(s);
					count=count+1;
					result.put(s,count);
				}else {
					result.put(s, 1L);
				}
        		
        	}
            return result;
        }
    }


}
