package but.trois.aped;

import org.junit.*;


import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test DefaultStack
 */
class DefaultStackTest {
    private DefaultStack stack;

    @Before
    public void setUp() {
        stack = new DefaultStack();
    }

    /**
     * Tests if this stack is empty
     */
    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push((SimpleStack.Item) new DefaultItem());
        assertFalse(stack.isEmpty());
    }

  /**
   * Returns the number of items in this stack.
   */
    @Test
    public void testGetSize() {
        assertEquals(0, stack.getSize());
        stack.push((SimpleStack.Item) new DefaultItem());
        assertEquals(1, stack.getSize());
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    @Test
    public void testPushAndPeek() {
        SimpleStack.Item item = (SimpleStack.Item) new DefaultItem();
        stack.push(item);
        assertSame(item, stack.peek());
    }

    /**
     * Looks at the object at the top of this stack without removing it from the
     * stack.
     */
    @Test(expected = EmptyStackException.class)
    public void testPeekWhenEmpty() {
        stack.peek();
    }

    /**
     * Removes the object at the top of this stack and returns that object as the
     * value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Test
    public void testPushAndPop() {
        SimpleStack.Item item = (SimpleStack.Item) new DefaultItem();
        stack.push(item);
        assertSame(item, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test(expected = EmptyStackException.class)
    public void testPopWhenEmpty() {
        stack.pop();
    }
}