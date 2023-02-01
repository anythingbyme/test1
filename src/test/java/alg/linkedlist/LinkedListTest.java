package alg.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    private LinkedList ll = new LinkedList();

    @Test
    void getLast() {
        ll.insertLast(5);
        ll.insertLast(3);
        ll.insertLast(1);
        ll.insertLast(2);
        Assertions.assertEquals( 5, ll.getFirst());
        Assertions.assertEquals(2, ll.getLast());
        Assertions.assertEquals(4, ll.size());
        ll.traverse();
        System.out.println("***********");
        ll.traverseFromFirst();
        System.out.println("***********");
//        ll.reverse();
//        ll.traverse();
    }

    @Test
    void getFirst() {
        ll.insertFirst(5);
        ll.insertFirst(3);
        ll.insertFirst(1);
        ll.insertFirst(2);
        Assertions.assertEquals(2, ll.getFirst());
        Assertions.assertEquals(5, ll.getLast());
        Assertions.assertEquals(4, ll.size());

        ll.reverse();

        Assertions.assertEquals(5, ll.getFirst());
        Assertions.assertEquals(2, ll.getLast());

//        ll.traverseFromFirst();
    }

    @Test
    void insertFirst() {
        ll.insertLast(5);
    }

    @Test
    void insertLast() {
    }

    @Test
    void size() {
    }

    @Test
    void remove() {
    }
}