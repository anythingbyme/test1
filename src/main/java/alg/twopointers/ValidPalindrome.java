package alg.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        List<Character> chars = new ArrayList<>();
        //remove non-letters
        for (char a: c) {
            if (Character.isLetter(a) || Character.isDigit(a)) {
                chars.add(a);
            }
        }

        for(int i=0;i<chars.size()/2;i++) {
            if (chars.get(i) != chars.get(chars.size()-i-1)) {
                return false;
            }
        }
        return true;

    }
}
