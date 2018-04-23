package com.learn.geeks.linkedlist;

public class DetectLoop {

	public static void main(String[] args) {
		
		Node a = new Node(4);
		a.next = new Node(3);
		a.next.next = new Node(2);
		a.next.next.next = new Node(1);
		Node x = new Node(10);
		a.next.next.next.next = x;
		a.next.next.next.next.next = new Node(11);
		a.next.next.next.next.next.next = new Node(12);
		a.next.next.next.next.next.next.next = new Node(13);
		a.next.next.next.next.next.next.next.next = new Node(14);
		a.next.next.next.next.next.next.next.next.next = x;
		detectLoop(a);
	}
	
	public static void detectLoop(Node a) {
		
		Node slowPtr = a;
		Node fastPtr = a.next;
		
		while(fastPtr != null && fastPtr.next != null && fastPtr != slowPtr) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		
		if(fastPtr == slowPtr && fastPtr != null)
			System.out.println("found loop in the list");
		
		System.out.println("delecting the loop node.....");
		slowPtr = a;
		while(fastPtr.next != slowPtr) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next;
		}
		
		System.out.println(slowPtr.data);
	}
}
