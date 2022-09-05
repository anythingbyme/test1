package ds.ll;

public class LinkedList1<E> implements ILinkedList<E> {
    private Node<E> first;
    private Node<E> prev;
    @Override
    public void insert(E E) {

    }

    @Override
    public void insertFirst(E e) {
        Node<E> node = new Node<E>(e, first);
        node.next = first;
        first = node;
        node.prev = prev;
        prev = node;
        System.out.println("node.prev="+ (node.prev == null ? "null": node.prev.getVal()));

        System.out.println("node.val="+node.getVal());
        System.out.println("node.next="+ (node.next == null ? "null": node.next.getVal()));
//        System.out.println("prev="+prev.getVal());
//        System.out.println("first.next="+first.next);

    }

    public E poll() {
        Node<E> temp = first;
        return temp.getVal();
    }

    @Override
    public void insertLast(Object o) {

    }

    @Override
    public void delete(Object o) {

    }

    @Override
    public void deleteFirst() {

    }

    @Override
    public void deleteLast() {

    }

    @Override
    public void sort() {

    }

    public Node<E> getFirst() {
        return first;
    }

    public Node<E> getPrev() {
        return prev;
    }

    @Override
    public void display() {
        Node temp = first;
        while(temp != null) {
            System.out.println("Display: "+temp.getVal());
            temp = temp.next;
        }
    }

    @Override
    public E get() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E next() {
        return null;
    }

    public void reverse() {
        // 1 2 3
        /**
         * 1.next = 2, 1.prev = null
         * 2.next = 3, 2.prev = 1
         * 3.next = null, 3.prev = 2
         * first = 3, last =1
         *
         * expected: 3 2 1
         * first = 1, last = 3
         *
         *
         * temp = last
         * last = first
         * first = temp
         *
         * first = 1, last = 3
         *
         *
         *
         */
        // first =1, last =3
        // temp = 3
        // 3 = 1
        // 1 = 1.next

        // last = first
        // first = first.next
        Node temp = first;
        Node last = null;
        while (temp != null) {
            if (temp.next == null) {
                last = temp;

            }
            temp = temp.next;

        }
        System.out.println(last.getVal());
        while (first != null) {
            temp = last;
            last = first;
            first = first.next;
        }


    }
}
