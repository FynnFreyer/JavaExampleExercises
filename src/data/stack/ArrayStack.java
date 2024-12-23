package data.stack;

import data.interfaces.SimpleStack;

import java.util.EmptyStackException;

/**
 * TODO: Implement a stack that is backed by an array of fixed size.
 *       The size should be passed via the constructor.
 *
 * <p>
 * TODO: compare with data.Tuple, to see an example for generics
 *
 * @param <E> the type of objects on the stack
 */
public class ArrayStack<E> implements SimpleStack<E> {
    E[] stack;
    int pointer;

    @SuppressWarnings("unchecked")
    public ArrayStack(int size) {
        // java is a piece of shit
        this.stack = (E[]) new Object[size];
        this.pointer = 0;
    }

    /**
     * Push an object onto the stack.
     *
     * @param val the object to put on the stack
     */
    @Override
    public void push(E val) {
        // ++x -> increment first, then do the thing
        // x++ -> do the thing first, then increment
        stack[pointer++] = val;
    }

    private void assertContent(){
        if (pointer <= 0) {
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
        assertContent();
        return stack[pointer--];
    }

    /**
     * Return the top-most object from the stack without removing it.
     *
     * @return the top-most object
     * @throws EmptyStackException if the stack is empty
     */
    @Override
    public E peek() {
        assertContent();
        return stack[pointer];
    }
}
