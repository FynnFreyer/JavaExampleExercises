package data.stack;

import data.interfaces.SimpleStack;

import java.util.EmptyStackException;

/**
 * TODO: Implement a stack that is not backed by an array,
 *       but instead internally keeps links between objects on the stack.
 *       Compare with data.list.SingleLinkedList.
 *
 * <p>
 * TODO: compare with data.Tuple, to see an example for generics
 *
 * @param <E> the type of objects on the stack
 */
public class LinkedStack<E> implements SimpleStack<E> {
    Node<E> top;

    /**
     * Push an object onto the stack.
     *
     * @param val the object to put on the stack
     */
    @Override
    public void push(E val) {
        top = new Node<>(val, top);
    }

    private void assertContent() {
        if (top == null) {
            throw new EmptyStackException();
        }
    }

    /**
     * Remove the top-most object from the stack and return it.
     *
     * @return the popped object
     * @throws EmptyStackException if the stack is empty
     */
    @Override
    public E pop() {
        assertContent();;
        E val = top.val;
        top = top.prev;
        return val;
    }

    /**
     * Return the top-most object from the stack without removing it.
     *
     * @return the top-most object
     * @throws EmptyStackException if the stack is empty
     */
    @Override
    public E peek() {
        return top.val;
    }

    // Node can be static, because it doesn't need to access anything non-static from the outer class
    // the notion of a static class only makes sense for classes inside other classes,
    // because inner classes by default get an implicit reference on the object of the containing class
    static class Node<E> {
        E val;
        Node<E> prev;

        public Node(E val, Node<E> prev) {
            this.val = val;
            this.prev = prev;
        }
    }
}
