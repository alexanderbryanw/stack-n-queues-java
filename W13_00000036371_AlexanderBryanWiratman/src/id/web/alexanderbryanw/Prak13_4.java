package id.web.alexanderbryanw;

public class Prak13_4 {
	int size;
	
	Node head;
	Node tail;
	
	Prak13_4(){
		this.size = 0;
	}
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	void enqueue(int new_data) {
		Node new_node = new Node(5);
		
		if(head == null) {
			head = new_node;
			System.out.println(head.data + " enqueued to the queue");
			return;
		}
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		tail = new_node;
		System.out.println(tail.data + " enqueued to the queue");
		return;
	}
	
	int dequeue() {
		int dequeueValue = head.data;
		head = head.next;
		
		return dequeueValue;
	}
	
	public static void main(String[] args) {
		Prak13_4 qll = new Prak13_4();
		
		qll.enqueue(10);
		qll.enqueue(20);
		qll.enqueue(30);
		qll.enqueue(40);
		int dequeValue = qll.dequeue();
		System.out.println(dequeValue + " dequeued from queue\n");
		System.out.println("Front item is " + qll.head.data);
		System.out.println("Rear item is " + qll.tail.data);
	}

}
