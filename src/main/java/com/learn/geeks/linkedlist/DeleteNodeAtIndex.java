package com.learn.geeks.linkedlist;

public class DeleteNodeAtIndex {

	public static void main(String[] args) {
		
		Node a = new Node(4);
		a.next = new Node(3);
		a.next.next = new Node(2);
		a.next.next.next = new Node(1);
		a.next.next.next.next = new Node(10);
		a.next.next.next.next.next = new Node(11);
		
		a= deleteNodeAtIndex(a,5);
		while(a != null) {
			System.out.print(a.data+" -> ");
			a = a.next;
		}
	}

	private static Node deleteNodeAtIndex(Node a,int index) {
		if(index == 1 || a == null) {
			return null;
		}
		int i=1;
		Node temp=a;
		while(i<index-1 && temp != null) {
			temp = temp.next;
			i++;
		}
		
		if(i == index-1 && temp != null && temp.next != null) {
			temp.next = temp.next.next;
		} 

		return a;
	}
}
