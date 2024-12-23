package data.interfaces;

import java.util.EmptyStackException;


/**
 * This is a simplified interface for Stack data structures.
 *
 * <p>Stacks provide the operations push, pop and peek.
 * Push adds an element to the top of the stack,
 * pop removes the top-most element and returns it, and
 * peek just returns it without removal.
 *
 * <p>Compare the article on stacks on wikipedia:
 * https://en.wikipedia.org/wiki/Stack_(abstract_data_type)
 *
 * <p>
 * TODO: compare with data.Tuple, to see an example for generics
 *
 * @param <E> the type of objects on the stack
 */
public interface SimpleStack<E> {
    /**
     * Push an object onto the stack.
     *
     * @param val the object to put on the stack
     */
    void push(E val);

    /**
     * Remove the top-most object from the stack and return it.
     *
     * @return the popped object
     * @throws EmptyStackException if the stack is empty
     */
    E pop();

    /**
     * Return the top-most object from the stack without removing it.
     *
     * @return the top-most object
     * @throws EmptyStackException if the stack is empty
     */
    E peek();
}
