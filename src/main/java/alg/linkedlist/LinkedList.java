package alg.linkedlist;

import lombok.Data;

@Data
public class LinkedList {

    Node<Integer> head;
    Node<Integer> tail;
    int size;

    //getFirst
    public Integer getFirst() {
        return head.data;
    }

    public Integer getLast() {
        return tail.data;
    }

    public void insertLast(Integer data) {
        if (tail == null) {
            tail = new Node<>(data, null, null);
            head = tail;
            size++;
        }
        else {
            Node newNode = new Node<>(data, null, tail);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void reverse() {
        while (head.next != null) {
            head = head.next;
        }
    }

    public void traverse() {
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;
        }

    }

    public void traverseFromFirst() {
        if (size == 0) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    public Integer insertFirst(Integer data) {
        if (head == null) {
            tail = new Node<>(data, null, null);
            head = tail;
            size++;
        }
        else {
            Node temp = head;

            Node newNode = new Node(data, temp, null);
            head.prev = newNode;
            head = newNode;
            size++;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public void remove(Integer integer) {
        //todo

    }

    //getLast
    //insertFirst
    //insertLast
    //size
    //remove

    @Data
    class Node<Integer> {
        Integer data;
        Node next;
        Node prev;
        public Node(Integer data, Node next, Node prev) {
            // null, 5, 3
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public Node(Integer data) {
            // null, 5, 3
            this.data = data;

        }
    }
}
