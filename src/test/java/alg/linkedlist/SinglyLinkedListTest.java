package alg.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void insert() {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insert(1);
        sll.insert(2);
        sll.insert(3);
        sll.insert(4);
        sll.traverse();
        Assertions.assertEquals(1, sll.getNode().val);

        sll.reverse();
        System.out.println("**************");

        sll.traverse();

    }

}