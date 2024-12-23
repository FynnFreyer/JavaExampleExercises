package data.list;

import data.interfaces.SimpleList;

/**
 * TODO: implement an array backed list
 *
 * <p>Check the article on array lists on wikipedia:
 * https://en.wikipedia.org/wiki/Dynamic_array
 *
 * <p>
 * TODO: compare with data.Tuple, to see an example for generics
 *
 * @param <E> the type of objects contained in the list
 */
public class DynamicArray<E> implements SimpleList<E> {
    /**
     * Checks if a list has contents.
     *
     * @return whether the list is empty
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /**
     * Gets the size of a list.
     *
     * @return number of elements contained in the list
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * Checks whether an element is in the list.
     *
     * @param element the element to look for
     * @return whether element is contained in the list
     */
    @Override
    public boolean contains(E element) {
        return false;
    }

    /**
     * Add an element to the end of the list.
     *
     * @param element the element to insert
     */
    @Override
    public void insert(E element) {

    }

    /**
     * Add an element to the list.
     *
     * @param element the element to insert
     * @param index   where to insert the element
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    @Override
    public void insert(E element, int index) {

    }

    /**
     * Removes the first occurence of the specified element.
     *
     * @param element the element to remove
     * @return the removed element
     */
    @Override
    public E remove(E element) {
        return null;
    }

    /**
     * Removes an element at the specified index.
     *
     * @param index the index to remove
     * @return the removed element
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    @Override
    public E remove(int index) {
        return null;
    }
}
