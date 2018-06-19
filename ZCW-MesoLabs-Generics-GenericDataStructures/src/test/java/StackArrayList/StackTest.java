package StackArrayList;

import org.junit.Test;

import org.junit.Assert;

public class StackTest {
    @Test
    public void testEmptyStackStopsBeingEmptyWhenAnItemIsAdded() throws Exception {
        // Given an empty stack
        Stack<String> stack = new Stack<>();
        // Assert that it starts empty
        Assert.assertEquals(true, stack.isEmpty());
        // When an element gets pushed
        stack.push("foobar");
        // Then the stack should not be empty.
        Assert.assertEquals(false, stack.isEmpty());
    }

    @Test
    public void testTwoItemsPushedComeOutInCorrectOrder() throws Exception {
        // Given an empty stack
        Stack<String> stack = new Stack<>();

        //When two items are pushed
        stack.push("foo");
        stack.push("bar");

        // Then they should come off in reverse order.
        Assert.assertEquals("bar", stack.pop());
        Assert.assertEquals("foo", stack.pop());

        // And then the stack should be empty
        Assert.assertEquals(true, stack.isEmpty());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPopFirst() throws Exception {
        // Given an empty stack
        Stack<String> stack = new Stack<>();
        // Then it is popped
        stack.pop();
        // We should get an exception
    }
}