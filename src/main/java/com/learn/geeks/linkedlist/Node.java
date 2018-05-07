package com.learn.geeks.linkedlist;

public class Node implements Cloneable {

	int data;
	Node next;
	Node random;

	Node(int d) {
		data = d;
		next = null;
		random = null;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}