package ds.ll;

public class SimpleLinkedList<E> implements ILinkedList<E>{
    public int size;
    public Node<E> first;
    public Node<E> last;

    @Override
    public void insert(E e) {
        Node<E> node = new Node<E>(e);
        node.next = first;
        first = node;
        size++;
    }

    @Override
    public void insertFirst(E e) {

    }

    @Override
    public void insertLast(E e) {
        Node<E> node = new Node<E>(e);

    }

    @Override
    public void delete(E e) {

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

    @Override
    public void display() {
        while (first != null) {
            System.out.println(first.getVal());
            first = first.next;
        }
    }

    @Override
    public E get() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E next() {
        return null;
    }

    public String peek() {
        return first == null ? null : String.valueOf(first.getVal());
    }
}
