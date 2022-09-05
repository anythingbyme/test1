package ds.ll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedList1Test {

    @Test
    void insertFirst() {
        LinkedList1 l = new LinkedList1<String>();
        l.insertFirst("one");
        l.insertFirst("two");
        l.insertFirst("three");
        l.display();
        Assertions.assertEquals("three", l.poll());
        Assertions.assertEquals("three", l.getFirst().getVal());
        Assertions.assertEquals("three", l.getPrev().getVal());
    }

    @Test
    void reverse() {
        LinkedList1 l = new LinkedList1<String>();
        l.insertFirst("one");
        l.insertFirst("two");
//        l.insertFirst("three");
//        l.reverse();
        l.display();
//        Assertions.assertEquals("one", l.poll());
//        Assertions.assertEquals("one", l.getFirst().getVal());
//        Assertions.assertEquals("three", l.getPrev().getVal());
    }

    @Test
    void insertLast() {
    }

    @Test
    void delete() {
    }

    @Test
    void display() {
    }

    @Test
    void next() {
    }
}