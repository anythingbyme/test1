package alg.stack;

import ds.stack.Stack;
import lombok.Getter;

@Getter
public class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        this.minStack = new Stack<>();
        this.stack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        if (minStack.size() == 0 || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        int n = stack.pop();
        if (n == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    // gwt code for min stack
}
