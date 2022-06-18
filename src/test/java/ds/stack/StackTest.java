package ds.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void push() {
        IStack s = new Stack<String>();
        s.push("a");
        s.push("c");
        s.pop();
        s.push("100");
        s.push("200");
        Assertions.assertEquals("200", s.peek());
        Assertions.assertEquals("200", s.pop());
        Assertions.assertEquals(2, s.size());
    }

    @Test
    void pop() {
    }

    @Test
    void size() {
    }

    @Test
    void peek() {
    }
}