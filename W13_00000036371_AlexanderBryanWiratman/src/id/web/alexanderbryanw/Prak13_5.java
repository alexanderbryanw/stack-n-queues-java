package id.web.alexanderbryanw;

import java.util.Scanner;

public class Prak13_5 {
	int size;

	static Barang head;
	static Barang tail;

	Prak13_5() {
		this.size = 0;
	}

	static class Barang {
		String data;
		Barang next;

		Barang(String data) {
			this.data = data;
		}
	}

	void enqueue(String new_data) {
		Barang new_barang = new Barang(new_data);

		if (head == null) {
			head = new_barang;
			return;
		}
		Barang last = head;
		while (last.next != null)
			last = last.next;
		last.next = new_barang;
		tail = new_barang;
		return;
	}

	String dequeue() {
		String dequeueBarang = head.data;
		head = head.next;

		return dequeueBarang;
	}

	static void printList() {
		Barang barang = head;
		System.out.println("----- Data Gudang -----");
		System.out.println("Nama Barang");
		if (barang == null)
			System.out.println("#Barang gudang kosong#");
		while (barang != null) {
			System.out.println("- "+ barang.data);
			barang = barang.next;
		}
	}

	public static void main(String[] args) {
		Prak13_5 gudang = new Prak13_5();
		Scanner scan = new Scanner(System.in);
		System.out.println("PROGRAM GUDANG Singly Linked List Queue oleh Alexander Bryan");
		printList();
		boolean ulang;
		while (ulang = true) {
			System.out.println("Menu :");
			System.out.println("1. Tambahkan barang\n2. Keluarkan barang\n3. List barang\n4. Keluar ");
			System.out.print("Pilihan : ");
			int pilihan = scan.nextInt();
			if (pilihan == 1) {
				System.out.print("Masukkan nama barang masuk : ");
				String namaBarang = scan.next();
				gudang.enqueue(namaBarang);
			} else if (pilihan == 2) {
				System.out.println("Barang keluar : " + gudang.dequeue());
	
			}else if (pilihan == 3) {
				printList();
				System.out.println("Barang terawal masuk " + head.data);
				System.out.println("Barang terakhir masuk " + tail.data);
			}else if (pilihan == 4) {
				ulang = false;
				break;
			}
		}
		System.out.println("Terima kasih telah menggunakan Program Gudang oleh Alexander Bryan");
	}

}
