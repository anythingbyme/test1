package ds.stack;

public interface IStack<T> {
    void push(T t);
    T pop();
    int size();
    T peek();
}
