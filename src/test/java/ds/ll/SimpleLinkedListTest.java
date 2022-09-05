package ds.ll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleLinkedListTest {

    @Test
    void insert() {
        SimpleLinkedList<String > sl = new SimpleLinkedList<String>();
        sl.insert("one");
        sl.insert("two");
        sl.insert("three");
        sl.insert("four");
        sl.insert("five");
        Assertions.assertEquals(5, sl.size);
        Assertions.assertEquals("five", sl.peek());
        sl.display();
    }
}