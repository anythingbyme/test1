package ds.ll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListTest {

    @Test
    void insert() {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        Assertions.assertEquals(5,ll.size());
        Assertions.assertEquals(5,ll.getNode().getVal());

    }

    @Test
    void delete() {
        LinkedList ll = new LinkedList();
        ll.insert(1);
        ll.insert(2);
        ll.insert(3);
        ll.insert(4);
        ll.insert(5);
        ll.traverse();
        Assertions.assertEquals(5,ll.size());
        Assertions.assertEquals(5,ll.getNode().getVal());
        ll.delete(5);
        Assertions.assertEquals(4,ll.size());
        Assertions.assertEquals(4,ll.getNode().getVal());
        ll.delete(4);
        ll.delete(3);
        Assertions.assertEquals(2,ll.size());
        Assertions.assertEquals(2,ll.getNode().getVal());
        ll.traverse();
    }

    @Test
    void size() {
        LinkedList ll = new LinkedList();
        ll.traverse();
        ll.display();
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(5);
        Assertions.assertEquals(5,ll.size());
        Assertions.assertEquals(5,ll.getFirst().getVal());
        ll.display();
        ll.traverse();
        ll.deleteFirst();
//        ll.traverse();
    }


    @Test
    void sort() {
        LinkedList ll = new LinkedList();
        ll.insertFirst(8);
        ll.insertFirst(1);
        ll.insertFirst(7);
        ll.insertFirst(2);
        ll.display();
        System.out.println("*********");
        ll.sort();
        ll.display();

        Assertions.assertEquals(4,ll.size());
        Assertions.assertEquals(1,ll.getFirst().getVal());
    }

    @Test
    void next() {
    }

    @Test
    void insertFirst() {
        LinkedList ll = new LinkedList();//stack
        ll.insertFirst(1);
        ll.insertFirst(2);
        ll.insertFirst(3);
        ll.insertFirst(4);
        ll.insertFirst(5);
        ll.traverse();
        Assertions.assertEquals(5,ll.size());
        Assertions.assertEquals(5,ll.getFirst().getVal());
        Assertions.assertEquals(1,ll.getLast().getVal()); //stack
        ll.traverse();
    }

    @Test
    void insertLast() {
        LinkedList ll = new LinkedList(); //queue
        ll.insertLast(1);
        ll.insertLast(2);
        ll.insertLast(3);
        ll.insertLast(4);
        ll.insertLast(5);
        ll.traverse();
        Assertions.assertEquals(5,ll.size());
        Assertions.assertEquals(1,ll.getFirst().getVal());
        Assertions.assertEquals(5,ll.getLast().getVal()); //queue
        ll.deleteLast();
        ll.traverse();
    }
}