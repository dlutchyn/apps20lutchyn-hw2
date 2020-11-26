package ua.edu.ucu.collections;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {
    
    @Test
    public void tesPeek() {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        assertEquals(1, q.peek());
    }

    @Test
    public void tesDequeue() {
        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(3);

        assertEquals(2, q.dequeue());
    }

    @Test
    public void testEnqueue() {
        Queue q = new Queue();
        q.enqueue(3);

        assertEquals(3, q.peek());
    }

    @Test
    public void testEmpty() {
        Queue q = new Queue();

        assertEquals("Empty!", q.peek());
    }
    
}
