package com.learn.geeks.linkedlist;

public class LinkedListMergeSort {

	public static void main(String[] args) {

		Node a = new Node(4);
		a.next = new Node(3);
		a.next.next = new Node(2);
		a.next.next.next = new Node(1);

		Node b = new Node(8);
		b.next = new Node(7);
		b.next.next = new Node(6);

		Node x = sort(a);
		Node y=sort(b);
		Node t = merge(x,y);
		
		
		System.out.println(t);
	}

	public static Node getMiddle(Node h) {
        if (h == null)
            return h;
        Node fastptr = h.next;
        Node slowptr = h;
         
        while (fastptr != null)
        {
            fastptr = fastptr.next;
            if(fastptr!=null)
            {
                slowptr = slowptr.next;
                fastptr=fastptr.next;
            }
        }
        return slowptr;
      }

	public static Node sort(Node root) {
		if (root == null || root.next == null)
			return root;

		Node temp = getMiddle(root);
		Node middle = temp.next;
		temp.next = null;

		root = sort(root);
		middle = sort(middle);
		
		return merge(root,middle);

	}

	public static Node merge(Node a, Node b) {
		if (a == null) {
			return b;
		}
		if (b == null) {
			return a;
		}
		if (a.data > b.data) {
			b.next = merge(a, b.next);
			return b;
		}

		if (a.data < b.data) {
			a.next = merge(a.next, b);
			return a;
		}
		
		return null;

	}

}
