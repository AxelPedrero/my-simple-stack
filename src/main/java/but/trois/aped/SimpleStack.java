package but.trois.aped;

import java.util.EmptyStackException;


/**
 * SimpleStack.
 */
public interface SimpleStack {

    /**
     * Object typed by a marker interface.
     */
     interface Item { }

    /**
     * Tests if this stack is empty.
     */
    boolean isEmpty();
    /**
     * Returns the number of items in this stack.
     * @return number.
     */
    int getSize();
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     * @return true.
     */
    void push(Item item);
    /**
     * Looks at the object at the top of this stack without removing it
     * from the stack.
     * @throws EmptyStackException if this stack is empty.
     */
    Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    Item pop() throws EmptyStackException;

}
