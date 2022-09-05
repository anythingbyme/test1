package ds.ll;

public class Node<E> {
    private E val;
    public Node next;
    public Node prev;
    public Node(E e) {
        this.val = e;
    }

    public Node(E val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node(E val, Node next, Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }


    public E getVal() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public Node next() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
