import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class CharStatTest {

	@Test
	void testPositive() {
		CharStatUtility csu = new CharStatUtility("aprócska kalapocska, benne csacska macska mocska");
		Map<Character, Integer> csuStat = csu.getStat();
		boolean result =  csuStat != null && csuStat.containsKey('a') && csuStat.get('a') == 10;
		assertTrue(result);
	}
	
	@Test
	void testNegative() {
		CharStatUtility csu = new CharStatUtility("aprócska kalapocska, benne csacska macska mocska");
		Map<Character, Integer> csuStat = csu.getStat();
		boolean result =  csuStat != null && csuStat.containsKey('í');
		assertFalse(result);
	}	
	
}
