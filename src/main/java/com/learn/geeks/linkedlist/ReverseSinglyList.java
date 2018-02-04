package com.learn.geeks.linkedlist;

public class ReverseSinglyList {

	static Node head;
	public static void main(String[] args) {

		 	head = new Node(1);
	        head.next = new Node(2);
	        head.next.next = new Node(3);
	        head.next.next.next = new Node(4);
	        head.next.next.next.next = new Node(5);
	        head.next.next.next.next.next = new Node(6);
	        head.next.next.next.next.next.next = new Node(7);
	        head.next.next.next.next.next.next.next = new Node(8);
	 
	        System.out.println("Original Linked list ");
	        printList(head);
	        reverse(head,null);
	        System.out.println();
	        printList(head);
	        

	}

	static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
	
	static Node reverse(Node curr,Node prev) {
		if(curr.next == null) {
			head = curr;
			curr.next = prev;
			return null;
		}
		Node next=curr.next;
		curr.next=prev;
		reverse(next,curr);
		return head;
	}
}
