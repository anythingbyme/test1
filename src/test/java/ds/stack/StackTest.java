package ds.stack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    void simpleSort(){
        int[] a = {8,1,2,5,9,9,1,3,4};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

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