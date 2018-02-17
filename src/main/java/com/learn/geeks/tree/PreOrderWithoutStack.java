package com.learn.geeks.tree;

import com.learn.geeks.Utils;

public class PreOrderWithoutStack {

	public static void main(String[] args) {

		preorder(Utils.getTree());
	}

	public static void preorder(Node node) {

		Node current = node;

		while (current != null) {
			if (current.left == null) {
				System.out.print(current.value + " ");
				current = current.right;
			} else {
				Node temp = current.left;
				while (temp != null && temp.right != current && temp.right != null) {
					temp = temp.right;
				}

				if (temp.right == null) {
					temp.right = current;
					System.out.print(current.value + " ");
					current = current.left;
				} else {
					temp.right = null;
					current = current.right;
				}
			}
		}
	}

}
