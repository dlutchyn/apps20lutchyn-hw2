package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Stack {
    private ImmutableLinkedList stack;

    public Stack() {
        this.stack = new ImmutableLinkedList(new Object[0]);
    }

    public Object peek() {
        return this.stack.getFirst();
    }

    public Object pop() {
        Object popObject = this.peek();
        this.stack = this.stack.removeFirst();
        return popObject;
    }

    public void push(Object e) {
        this.stack = this.stack.addFirst(e);
    }

}
