package alg.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    private Anagram anagram = new Anagram();

    @Test
    void isValid1() {
        Assertions.assertEquals(true, anagram.isValid("abc", "bac"));
    }

    @Test
    void isValid2() {
        Assertions.assertEquals(false, anagram.isValid("abc", "bdb"));
    }

    @Test
    void groupAnagrams() {
            String[] strs = {"eat","tea","tan","ate","nat","bat"};
//        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        anagram.groupAnagrams(strs);
    }
}