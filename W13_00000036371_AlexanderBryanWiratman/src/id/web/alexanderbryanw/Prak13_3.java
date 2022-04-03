package id.web.alexanderbryanw;

public class Prak13_3 {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	public boolean isEmpty(){
		if (head == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		
		if(head==null) {
			head = newNode;
		}else {
			Node temp = head;
			head = newNode;
			newNode.next = temp;
		}
		System.out.println(data + " pushed to stack");
	}
	
	public int pop() {
		if(head==null) {
			System.out.println("Stack is Empty");
			return -1;
		}else {
			int popped = head.data;
			head = head.next;
			return popped;
		}
	}
	
	public int peek() {
		if(head==null) {
			System.out.println("Stack is Empty");
			return -1;
		}else {
			return head.data;
		}
	}
	
	public static void main(String[] args) {
		Prak13_3 sll = new Prak13_3();
		sll.push(100);
		sll.push(20);
		sll.push(30);
		System.out.println(sll.pop() + " Popped from stack");
		System.out.println(sll.peek() + " adalah top data");
	}
}
