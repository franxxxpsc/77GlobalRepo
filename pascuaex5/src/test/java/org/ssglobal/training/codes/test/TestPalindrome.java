package org.ssglobal.training.codes.test;

import org.junit.jupiter.api.Test;
import org.ssglobal.training.codes.Palindrome;

public class TestPalindrome {
	
	@Test
	public void testIsPalindrome() {
		Palindrome p = new Palindrome();
		System.out.println(p.isPalindrome());
	}
}
