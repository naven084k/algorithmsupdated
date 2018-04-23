package com.learn.geeks.linkedlist;

public class ReverseSinglyLinkedList {

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
		
		a= pairWiseReverse(a,3);
		while(a != null) {
			System.out.print(a.data+" -> ");
			a = a.next;
		}
	}
	
	private static Node findAtIndex(Node a,int index) {
		if(index == 1 || a == null) {
			return null;
		}
		int i=1;
		Node temp=a;
		while(i<index-1 && temp != null) {
			temp = temp.next;
			i++;
		}
		
		return temp!=null && temp.next!=null?temp.next:temp;
	}
	
	public static Node pairWiseReverse(Node a,int length) {
		Node temp = findAtIndex(a,length);
		if(temp == null || temp.next == null)
			return reverse(a);
		
		Node x=temp.next;
		temp.next = null;
		
		temp = reverse(a);
		a.next = pairWiseReverse(x,length);
		return temp;
	}
	
	public static Node reverse(Node a) {
		if(a == null)
			return null;
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
