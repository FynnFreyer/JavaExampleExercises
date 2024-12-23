package data.interfaces;

/**
 * This is a simplified interface for List data structures.
 *
 * <p>Lists should support checking membership of elements,
 * getting the number of contained items, and adding and removing items.
 *
 * <p>Compare the articles on lists on wikipedia:
 * https://en.wikipedia.org/wiki/List_(abstract_data_type)
 * https://en.wikipedia.org/wiki/Dynamic_array
 * https://en.wikipedia.org/wiki/Linked_list
 * https://en.wikipedia.org/wiki/Doubly_linked_list
 *
 * <p>
 * TODO: compare with data.Tuple, to see an example for generics
 *
 * @param <E> the type of objects contained in the list
 */
public interface SimpleList<E> {
    /**
     * Checks if a list has contents.
     *
     * @return whether the list is empty
     */
    boolean isEmpty();

    /**
     * Gets the size of a list.
     *
     * @return number of elements contained in the list
     */
    int size();

    /**
     * Checks whether an element is in the list.
     *
     * @param element the element to look for
     * @return whether element is contained in the list
     */
    boolean contains(E element);

    /**
     * Add an element to the end of the list.
     *
     * @param element the element to insert
     */
    void insert(E element);

    /**
     * Add an element to the list.
     *
     * @param element the element to insert
     * @param index   where to insert the element
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    void insert(E element, int index);

    /**
     * Removes the first occurence of the specified element.
     *
     * @param element the element to remove
     * @return the removed element
     */
    E remove(E element);

    /**
     * Removes an element at the specified index.
     *
     * @param index the index to remove
     * @return the removed element
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    E remove(int index);
}
