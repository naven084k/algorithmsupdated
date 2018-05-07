package com.learn.geeks.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CloneRandomPointerList {

	public static void main(String[] args) throws CloneNotSupportedException {

		Node a = new Node(5);
		a.next = new Node(4);
		a.next.next = new Node(3);
		a.next.next.next = new Node(2);
		a.next.next.next.next = new Node(1);

		a.random = a.next.next;
		a.next.random = a;

		a.next.next.random = a.next.next.next.next;
		a.next.next.next.next.random = a.next.next.next;
		a.next.next.next.random = a.next.next;

		Node result = cloneUsingwithOutExtraMemory(a);
		System.out.println(result);

		Node temp = a;
		while (temp.next != null) {
			System.out.print(temp.random.data + " ");
			temp = temp.next;
		}
		temp = result;
		System.out.println();
		while (temp.next != null) {
			System.out.print(temp.random.data + " ");
			temp = temp.next;
		}
	}

	public static Node cloneUsingwithOutExtraMemory(Node root) throws CloneNotSupportedException {
		Node head = null;
		Node cloned = null;
		Node temp = root;
		Node prev = null;
		while (temp != null) {
			cloned = (Node) temp.clone();
			cloned.data = cloned.data + 10;
			
			if(prev != null)
				prev.next = cloned;
			
			if (head == null) {
				prev = head = cloned;
			} else {
				prev = cloned;
			}

			Node x = temp.next;
			temp.next = cloned;
			cloned.random = temp;
			temp = x;
		}
		
		cloned = head;
		while(cloned !=null) {
			temp = cloned.random;
		    cloned.random = temp.random.next;
		    
		    if(cloned.next != null)
			    temp.next = cloned.next.random;
		    cloned = cloned.next;
		}
		
		

		return head;
	}

	public static Node cloneUsingHashMap(Node root) throws CloneNotSupportedException {
		Node head = null;
		Map<Integer, Node> map = new HashMap<>();
		Node temp = root;
		while (temp != null) {
			Node temp1 = (Node) temp.clone();
			temp1.data = temp1.data + 10;
			map.put(temp.data, temp1);
			temp = temp.next;
		}
		temp = root;
		Node cloned = null;
		while (temp != null) {
			if (head == null) {
				cloned = head = map.get(temp.data);
			} else {
				cloned = map.get(temp.data);
			}
			if (temp.next != null)
				cloned.next = map.get(temp.next.data);
			if (temp.random != null)
				cloned.random = map.get(temp.random.data);
			temp = temp.next;
		}
		return head;
	}
}
