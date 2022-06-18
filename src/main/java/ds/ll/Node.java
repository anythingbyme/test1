package ds.ll;

public class Node<E> {
    private E val;
    private Node next;
    public Node(E e) {
        this.val = e;
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
