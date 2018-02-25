package com.learn.geeks.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PerfectBTreeSpecificOrderTraversal {

	public static void main(String[] args) {

		
		Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
  
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
  
        node.left.left.left = new Node(8);
        node.left.left.right = new Node(9);
        node.left.right.left = new Node(10);
        node.left.right.right = new Node(11);
        node.right.left.left = new Node(12);
        node.right.left.right = new Node(13);
        node.right.right.left = new Node(14);
        node.right.right.right = new Node(15);
  
        node.left.left.left.left = new Node(16);
        node.left.left.left.right = new Node(17);
        node.left.left.right.left = new Node(18);
        node.left.left.right.right = new Node(19);
        node.left.right.left.left = new Node(20);
        node.left.right.left.right = new Node(21);
        node.left.right.right.left = new Node(22);
        node.left.right.right.right = new Node(23);
        node.right.left.left.left = new Node(24);
        node.right.left.left.right = new Node(25);
        node.right.left.right.left = new Node(26);
        node.right.left.right.right = new Node(27);
        node.right.right.left.left = new Node(28);
        node.right.right.left.right = new Node(29);
        node.right.right.right.left = new Node(30);
        node.right.right.right.right = new Node(31);
        
		printLevelOrderSpecific(node);
		System.out.println();
		printReverseLevelOrderSpecific(node);
	}

	private static void printLevelOrderSpecific(Node node) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		queue.add(null);
		
		while(!queue.isEmpty()) {
			Node x = queue.poll();
			Node y = queue.poll();
			if(x != null && y!= null) {
				if(x.left != null)
				queue.add(x.left);
				
				if(y.right != null)
				queue.add(y.right);
				
				if(x.right != null)
				queue.add(x.right);
				
				if(y.left != null)
				queue.add(y.left);
				
				System.out.print(x.value+" "+y.value+" ");
			} else if(x != null) {
				if(x.left != null)
				queue.add(x.left);
				if(x.right != null)
				queue.add(x.right);
				
				System.out.print(x.value+" ");
			} 
		}
	}
	
	private static void printReverseLevelOrderSpecific(Node node) {
		if(node != null) {
			Stack<Node> stack = new Stack<>();
			stack.push(node);
			if(node.left != null) {
				stack.push(node.right);
				stack.push(node.left);
			}
			if(node.left.left != null) {
				
				Queue<Node> queue = new LinkedList<>();
				queue.add(node.left);
				queue.add(node.right);
				
				while(!queue.isEmpty()) {
					Node x = queue.poll();
					Node y = queue.poll();
					
					stack.push(y.left);
					stack.push(x.right);
					stack.push(y.right);
					stack.push(x.left);
					
	            if(x.left.left != null) {
	            	
	            	queue.add(x.right);
					queue.add(y.left);
					queue.add(x.left);
					queue.add(y.right);
					
	            	}
				}
			}
			
			while(!stack.isEmpty()) {
				System.out.print(stack.pop().value+" ");
			}
			
		}
	}
	

}
