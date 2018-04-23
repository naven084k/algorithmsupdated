package com.learn.geeks.linkedlist;

public class FindMergePoint {

	public static void main(String[] args) {
		Node a = new Node(15);
		a.next = new Node(14);
		a.next.next = new Node(13);
		a.next.next.next = new Node(12);
		a.next.next.next.next = new Node(11);
		a.next.next.next.next.next = new Node(10);
		a.next.next.next.next.next.next = new Node(9);
		a.next.next.next.next.next.next.next = new Node(8);
		
		Node b = new Node(4);
		b.next = a.next.next.next.next.next.next ;
		System.out.println(FindMergeNode(a,b));
	}
	
	static int FindMergeNode(Node headA, Node headB) {
	    Node currentA = headA;
	    Node currentB = headB;

	    //Do till the two nodes are the same
	    while(currentA != currentB){
	        //If you reached the end of one list start at the beginning of the other one
	        //currentA
	        if(currentA.next == null){
	            currentA = headB;
	        }else{
	            currentA = currentA.next;
	        }
	        //currentB
	        if(currentB.next == null){
	            currentB = headA;
	        }else{
	            currentB = currentB.next;
	        }
	    }
	    return currentB.data;
	}
}
