package id.web.alexanderbryanw;

public class Prak13_2 {
	static final int MAX = 1000;
	int front, rear, size;
	int array[] = new int [MAX]; 
	
	public Prak13_2() {
		this.front = 0;
		this.rear = -1;
		this.size = 0;
	}
	
	boolean isFull(Prak13_2 queue) {
		return (queue.size == MAX - 1);
	}
	
	boolean isEmpty(Prak13_2 queue) {
		return (queue.size == 0);
	}
	
	void enqueue(int item) {
		if (isFull(this))
			return;
		this.rear = this.rear + 1;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + " enqueued to the queue");
	}
	
	int dequeue() {
		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item = this.array[this.front];
		this.front = this.front + 1;
		this.size = this.size - 1;
		return item;
	}
	public static void main(String[] args) {
		Prak13_2 queue = new Prak13_2();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		
		System.out.println(queue.dequeue() + " dequeued from queue\n");
		System.out.println("Front item is " + queue.array[queue.front]);
		System.out.println("Rear item is " + queue.array[queue.rear]);
	}
// Fungsi isFull digunakan untuk queue dengan kapasitas penuh mencapai MAX 
	//sehingga tidak dapat melakukan enqueue.

//Fungsi isEmpty digunakan untuk queue dengan isi yang kosong, maka jika di enqueue
	// yang dienqueue adalah nilai min value dari integer.
}
