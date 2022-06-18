package ds.ll;

public interface ILinkedList<E> {
    void insert(E e);
    void insertFirst(E e);
    void insertLast(E e);
    void delete(E e);
    E get();
    int size();
    E next();
}
