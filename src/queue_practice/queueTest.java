package queue_practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class queueTest {
	myQueue q = new myQueue();

	@Before
	public void bMethod() {
		q.enqueue("Hi");
		q.enqueue("Bye");
	}

	@Test
	public void testIsEmpty() {
		assertFalse(q.isEmpty());
	}

	@Test
	public void testEnqueue() {
		q.enqueue("!");
		assertEquals(3, q.getQueueSize());
	}

	@Test
	public void testDequeue() {
		q.dequeue();
		assertEquals(1, q.getQueueSize());
	}

}
