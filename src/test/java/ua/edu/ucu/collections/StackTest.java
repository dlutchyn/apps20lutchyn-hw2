package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void tesPeek() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.peek());
    }

    @Test
    public void tesPop() {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
    }

    @Test
    public void testPush() {
        Stack stack = new Stack();
        stack.push(3);

        assertEquals(3, stack.peek());
    }

    @Test
    public void testEmpty() {
        Stack stack = new Stack();

        assertEquals("Empty!", stack.peek());
    }
    
}
