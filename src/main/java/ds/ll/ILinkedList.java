package ds.ll;

public interface ILinkedList<E> {
    void insert(E e);
    void insertFirst(E e);
    void insertLast(E e);
    void delete(E e);
    void deleteFirst();
    void deleteLast();
    void sort();
    void display();
    E get();
    int size();
    E next();
}
