import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void testPositive() {
		PalindromeUtilities pu = new PalindromeUtilities();
		boolean result = pu.isPalindrome("bab");
		assertTrue(result);
	}

	@Test
	void testNegative() {
		PalindromeUtilities pu = new PalindromeUtilities();
		boolean result = pu.isPalindrome("baba");
		assertFalse(result);
	}
	
	
}
