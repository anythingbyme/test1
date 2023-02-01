package alg.linkedlist;

import lombok.Data;

public class SinglyLinkedList {

    Node<Integer> node;
    int size;


    public Node<Integer> getNode() {
        return node;
    }

    public void insert(Integer val) {
        Node newNode = new Node<>(val);
        if (node == null) {
            node = newNode;
        }
        else {
            Node temp = node;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        size ++;
    }

    public void reverse() {
        Node prev = null;
        Node next = null;
        Node temp = node;

        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        node = prev;
    }

    public void traverse() {
        Node temp = node;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    @Data
    class Node<Integer> {
        java.lang.Integer val;
        Node next;

        public Node(java.lang.Integer val) {
            this.val = val;
        }
    }
}
