package queue_practice;

public class myQueue {
	int front;
	int rear;
	Object obj[];

	public myQueue() {
		this.front = -1;
		this.rear = -1;
		this.obj = new Object[100];
	}

	public boolean isEmpty() {
		return (front == rear);
	}

	public void enqueue(Object value) {
		this.obj[++rear] = value;
	}

	public Object dequeue() {
		this.obj[front + 1] = null;

		return this.obj[++front];

	}

	public int getQueueSize() {
		return (rear - front);
	}

	public void printQueue() {
		for (int i = (front + 1); i <= rear; i++) {
			System.out.println(obj[i] + " ");
		}
	}
}