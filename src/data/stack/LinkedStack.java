package data.stack;

import data.interfaces.SimpleStack;

import java.util.EmptyStackException;

/**
 * TODO: Implement a stack that is not backed by an array,
 *       but instead internally keeps links between objects on the stack.
 *       The size should be increased if it gets too small.
 *       Compare with data.list.SingleLinkedList.
 *
 * <p>
 * TODO: compare with data.Tuple, to see an example for generics
 *
 * @param <E> the type of objects on the stack
 */
public class LinkedStack<E> implements SimpleStack<E> {
    /**
     * Push an object onto the stack.
     *
     * @param val the object to put on the stack
     */
    @Override
    public void push(E val) {

    }

    /**
     * Remove the top-most object from the stack and return it.
     *
     * @return the popped object
     * @throws EmptyStackException if the stack is empty
     */
    @Override
    public E pop() {
        return null;
    }

    /**
     * Return the top-most object from the stack without removing it.
     *
     * @return the top-most object
     * @throws EmptyStackException if the stack is empty
     */
    @Override
    public E peek() {
        return null;
    }
}
