package alg.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    private ValidParentheses vp = new ValidParentheses();

    @Test
    void isValid1() {
        String s = "{([])}";
        Assertions.assertTrue(vp.isValid(s));
    }
    @Test
    void isValid2() {
        String s = "{])}"; //invalid
        Assertions.assertFalse(vp.isValid(s));
    }
    @Test
    void isValid3() {
        String s = "{([])}({})[]";
        Assertions.assertTrue(vp.isValid(s));
    }
    @Test
    void isValid4() {
        String s = "{([])}({)[]"; //invalid
        Assertions.assertFalse(vp.isValid(s));
    }
    @Test
    void isValid5() {
        String s = "{"; //invalid
        Assertions.assertFalse(vp.isValid(s));
    }

    @Test
    void isValid6() {
        String s = "{{"; //invalid
        Assertions.assertFalse(vp.isValid(s));
    }
    @Test
    void isValid7() {
        String s = "}{"; //invalid
        Assertions.assertFalse(vp.isValid(s));
    }
    @Test
    void isValid8() {
        String s = "}()"; //invalid
        Assertions.assertFalse(vp.isValid(s));
    }

    @Test
    void isValid9() {
        String s = "}"; //invalid
        Assertions.assertFalse(vp.isValid(s));
    }
    @Test
    void isValid10() {
        String s = "()}"; //invalid
        Assertions.assertFalse(vp.isValid(s));
    }
}