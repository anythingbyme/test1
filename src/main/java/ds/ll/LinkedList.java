package ds.ll;

public class LinkedList<E> implements ILinkedList<E> {
    //Having a reference to first and last makes it a double-ended linked list
    private Node first;
    private Node last;
    private Node node;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    private int size;

    @Override
    public void insert(E e ) {
        Node newNode = new Node(e);
        newNode.setNext(first);
        node = newNode;
        size++;
    }

    @Override
    public void insertFirst(E e) {
        Node newNode = new Node(e);
        //newNode.next=first;
        //first = newNode
        newNode.setNext(first);
        first = newNode;
        size++;
    }

    @Override
    public void insertLast(E e) {
        Node newNode = new Node<E>(e);
        //first.next = newNode;
        //first = newNode
        if (first == null) {
            first = newNode;
        }
        first.setNext(newNode);
        first = newNode;
        size++;
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
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
//        int i = 0;
//        Node temp = first;
//        System.out.println(temp.getVal());
//        while (temp != null) {
//            temp = temp.getNext();
//            i++;
//        }
//        return i;
        return this.size;
    }

    @Override
    public E next() {
        return null;
    }
}
