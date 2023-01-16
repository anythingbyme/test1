package alg.twopointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    private ValidPalindrome vp = new ValidPalindrome();
    @Test
    void isPalindrome() {
        /*
        Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
         */
        String s = "A man, a plan, a canal: Panama";
        Assertions.assertEquals(true, vp.isPalindrome(s));
    }

    @Test
    void isPalindrome2() {
        /*
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
         */
        String s = "race a car";
        Assertions.assertEquals(false, vp.isPalindrome(s));
    }
}