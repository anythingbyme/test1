package ds.ll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void insert() {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        Assertions.assertEquals(5,ll.getLast().getVal());
        Assertions.assertEquals(5,ll.size());

    }

    @Test
    void delete() {
    }

    @Test
    void size() {
    }

    @Test
    void next() {
    }
}