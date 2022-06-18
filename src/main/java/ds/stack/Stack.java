package ds.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack<E> implements IStack<E>{
    private List<E> l = new ArrayList<>();
    @Override
    public void push(E e) {
        l.add(e);
    }

    @Override
    public E pop() {
        return l.remove(l.size()-1);
    }

    @Override
    public int size() {
        return l.size();
    }

    @Override
    public E peek() {
        return l.get(l.size()-1);
    }
}
