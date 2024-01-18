import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class CharStatUtility {
	
	private Map<Character, Integer> statStorage;
	private String inputValue;
	
	public CharStatUtility(String inputValue) {
		this.inputValue = inputValue;
	}
	
	public Map<Character, Integer> getStat() {
		statStorage = new TreeMap<>();
		
		if (inputValue != null ||
			inputValue.length() != 0) {
			for(int i = 0; i < inputValue.length(); i++) {
				addStatStorage(inputValue.charAt(i));
			}
			
		}		
		
		return Collections.unmodifiableMap(statStorage);
	}
	
	private void addStatStorage(Character charValue) {
		if (!statStorage.containsKey(charValue)) {
			statStorage.put(charValue, 1);
		}
		else {
			statStorage.put(charValue, statStorage.get(charValue) + 1);
		}
	}
	
}
