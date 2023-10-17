package but.trois.aped;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * DefaultStack.
 */
public class DefaultStack implements SimpleStack {
    /**
     * Items List.
     */
    private List<Item> items;

    /**
     * Defaults stack for test.
     */

    public DefaultStack() {
        this.items = new ArrayList<>();
    }

    /**
     * Tests if this stack is empty.
     */
    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * Returns the number of items in this stack.
     */
    @Override
    public int getSize() {
        return items.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item
     */
    @Override
    public void push(final Item item) {
        items.add(item);

    }

    /**
     * Looks at the object at the top of this stack without removing it from the
     * stack.
     */
    @Override
    public Item peek() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return items.get(items.size() - 1);
    }

    /**
     * Removes the object at the top of this stack and returns that
     * object as the value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return items.remove(items.size() - 1);
    }
}
