package stack_practice;

public class myStack {
	private Object obj[];
	private int count;

	public myStack() {
		this.obj = new Object[100];
		this.count = 0;
	}

	public Object pop() {
		char popVal = (char) this.obj[this.count - 1];
		this.obj[this.count] = null;
		this.count--;

		return popVal;
	}

	public void push(Object val) {
		this.obj[this.count] = val;
		this.count++;
	}

	public void print() {
		for (int i = 0; i < this.count; i++) {
			System.out.println(this.obj[i] + " ");
		}
	}

	public int getCount() {
		return count;
	}
}
