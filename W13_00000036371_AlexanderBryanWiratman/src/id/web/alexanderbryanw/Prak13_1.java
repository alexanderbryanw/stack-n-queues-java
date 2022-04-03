package id.web.alexanderbryanw;

public class Prak13_1 {
	static final int MAX = 1000; // index = jumlah data + 1
	int top;
	int a[] = new int [MAX]; // Maximum size of Stack
	
	boolean isEmpty() { // buat ngecek stacknya ada isinya ga sih?
		return (top < 0);
	}
	
	Prak13_1() {
		top = -1;
	}
	
	boolean push(int x) {
		if(top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		}else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}
	
	int pop() {
		if(top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}else {
			int x = a[top--];
			return x;
		}
	}
	
	public static void main(String[] args) {
		Prak13_1 s = new Prak13_1();
		s.push(100);
		s.push(20);
		s.push(30); // dia bakalan dipop
		System.out.println(s.pop() + " Popped from stack");
	}
// HASIL:
	//  100 pushed into stack
	// 20 pushed into stack
	// 30 pushed into stack
	// 30 Popped from stack
	
//	Fungsi push untuk memasukkan data ke dalam Stack (menjadi tumpukkan paling atas).
// Fungsi pop untuk mengeluarkan data paling atas/ terakhir dimasukkan dalam Stack.	
}
