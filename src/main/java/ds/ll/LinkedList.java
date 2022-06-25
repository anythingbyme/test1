package ds.ll;

public class LinkedList<E> implements ILinkedList<E> {
    //Having a reference to first and last makes it a double-ended linked list
    private Node first;
    private Node last;
    private Node node;

    private int size;

    @Override
    public void insert(E e ) {
        Node newNode = new Node(e);
        //node.next=first
        //first=node
        newNode.setNext(node);
        node = newNode;
        size++;
    }

    /**
     * Inserting first makes linkedlist a stack
     * @param e
     */
    @Override
    public void insertFirst(E e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        else {
            //newNode.next=first;
            //first = newNode
            newNode.setNext(first);
            first = newNode;
        }

        size++;
    }

    /**
     * Inserting first makes linkedlist a queue
     * @param e
     */
    @Override
    public void insertLast(E e) {
        Node newNode = new Node<E>(e);
        //first.next = newNode;
        //first = newNode
        if (first == null) {
            first = newNode;
            last = newNode;
        }
        last.setNext(newNode);
        last = newNode;
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
        return last;
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
        if (node != null) {
            //node = node.next
            node = node.getNext();
            size--;
        }
    }

    @Override
    public void deleteFirst() {
        if (first != null) {
            Node temp = first;
            first = first.getNext();
            size--;
            temp = null;
        }
    }

    @Override
    public void sort() {
        Node temp = first;
        while(temp != null) {
            if (temp.getNext() != null && temp.getVal() instanceof Integer) {
                if ((Integer)temp.getVal() > (Integer) temp.getNext().getVal()) {
//                    Node t = new Node(temp.getVal());
//                    temp.setVal(temp.getNext().getVal());
//                    temp.getNext().setVal(t.getVal());
                    Node t = temp;
                    temp = temp.next();
                    temp.setNext(t);
                }
                else {
                    temp = temp.getNext();
                }
            }
            else {
                temp = temp.getNext();
            }
//            first = first.getNext();
        }
    }

    @Override
    public void deleteLast() {
        if (last != null) {
            last = last.getNext();
            size--;
        }
    }

    public void traverse() {
        Node temp = first;
        while (first != null) {
            System.out.println("Traverse(): "+temp.getVal());
            first = first.getNext();
        }
    }

    @Override
    public E get() {
        return null;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E next() {
        return null;
    }

    @Override
    public void display() {
        if (size == 0) {
            System.out.println("Display():List is empty");
        }
        Node temp = first;
        while (temp != null) {
            System.out.println("Display(): "+temp.getVal());
            temp = temp.next();
        }
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }



}
