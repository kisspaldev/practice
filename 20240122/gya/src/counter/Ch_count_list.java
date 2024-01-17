package counter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Ch_count_list {
	private List<Ch_count> items;
	private String text;
	
	/**
	 * Inicializálja az objektumot, és le is futtatja a számolást
	 * @param text
	 */
	public Ch_count_list(String text) {
		items = new ArrayList<Ch_count>();
		this.text = text;
		char_count();
	}
	

	/**
	 * Sorba rendezi karakterek szerint az eredményt, és átalakítja string-be
	 */
	public String toString() {
		sort();
		return items.toString();
	}
	

    
    private void sort() {
    	Comparator<Ch_count> bycharacter = new Comparator<Ch_count>() {

			@Override
			public int compare(Ch_count o1, Ch_count o2) {
				return o1.getCh().compareTo(o2.getCh());
			}
		};
		items.sort(bycharacter);
    }
    
    private  void char_count(){
        if(this.text != null) {  
        	String[] char_array = this.text.split("");
			for (String s : char_array) {
				this.add(s);      		
        	}
        }
        
    }
    
	private void add(String ch) {
		Ch_count item = find(ch);
		if (item != null) {
			item.inc();
		}else {
			Ch_count newitem = new Ch_count(ch);
			items.add(newitem);
		}
	}
	
    private Ch_count find(String ch) {
		for(Ch_count i:items) {
			if (i.getCh().compareTo(ch) == 0) {
				return i;
			}
		}
		return null;
	}

}
