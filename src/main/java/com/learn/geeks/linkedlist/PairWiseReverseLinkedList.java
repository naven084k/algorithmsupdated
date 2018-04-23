package com.learn.geeks.linkedlist;

public class PairWiseReverseLinkedList {

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
		
		a= reverse(a);
		while(a != null) {
			System.out.print(a.data+" -> ");
			a = a.next;
		}
	}
	
	public static Node reverse(Node a) {
		Node p=null;
		Node q=a;
		Node r=q.next;
		
		while(q != null) {
			q.next = p;
			p=q;
			q=r;
			if(r != null)
			r = r.next;
		}
		return p;
		
	}
}
