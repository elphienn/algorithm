package queue_practice;

public class mainQueue {
	public static void main(String[] args) {
		myQueue queue = new myQueue();

		queue.enqueue("Hi");
		queue.enqueue("my");
		queue.enqueue("name");
		queue.enqueue("is");
		queue.enqueue("elphaba");
		queue.dequeue();

		queue.printQueue();
	}
}
