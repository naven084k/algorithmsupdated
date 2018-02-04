package com.learn.geeks.tree;

import java.util.Stack;

import com.learn.geeks.Utils;

public class ZigZagLevelTraversal {
	public static void main(String[] args) {
				zigzag(Utils.getTree());
	}
	public static void zigzag(Node root) {
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		
		s1.push(root);
		while(!s1.isEmpty() || !s2.isEmpty()) {
			while(!s1.isEmpty()) {
				Node temp = s1.pop();
				System.out.print(temp.value+" ");
				if(temp.left != null)
				s2.push(temp.left);
				if(temp.right != null)
				s2.push(temp.right);
			}
			
			while(!s2.isEmpty()) {
				Node temp = s2.pop();
				System.out.print(temp.value+" ");
				if(temp.right != null)
				s1.push(temp.right);
				if(temp.left != null)
				s1.push(temp.left);
			}
		}
	}

}
