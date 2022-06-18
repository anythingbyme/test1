package ds.ll;

public class LinkedList<E> implements ILinkedList<E> {
    private Node first;
    private Node last;
    private Node node;

    @Override
    public void insert(E e ) {
        Node newNode = new Node(e,first);
        if (node == null) {
            node = new Node(e);
            node.setVal(newNode.getVal());
            node.setNext(newNode);
        }
        else {
            Node temp = node.getNext();
            temp.setNext(newNode);
            node.setNext(newNode);
        }

    }


    public void insert2(E e ) {
        if (first == null) {
            first = new Node(e);
            this.first.setVal(e);
            last = new Node(first.getVal());
            this.first.setNext(last);
        }
        Node temp = new Node(last.getVal());
        temp.setNext(last);
        Node n = new Node(e);
        temp.setNext(n);

        last = new Node(n.getVal());

    }

    public Node getLast() {
        return node.getNext();
    }

    public void insert1(E e ) {
        if (first == null) {
            first = new Node(e);
            this.first.setVal(e);
            this.first.setNext(null);
        }
        else {
            if (last == null) {
                last = new Node(e);
                first.setNext(last);
            }
            else if (last.getNext() == null) {
                Node n = new Node(e);
                last.setNext(n);
            }
            else {
                Node temp = new Node(last.getVal());
                temp.setNext(last.getNext());
                Node n = new Node(e);
                temp.setNext(n);
                last.setVal(n.getVal());
                last.setNext(n);
            }
        }
    }

    @Override
    public void delete(E e) {

    }

    @Override
    public E get() {
        return null;
    }

    @Override
    public int size() {
        int i = 0;
        while (node != null) {
            node = node.getNext();
            i++;
        }
        return i;
    }

    @Override
    public E next() {
        return null;
    }
}
