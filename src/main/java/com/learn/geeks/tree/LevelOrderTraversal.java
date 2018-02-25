package com.learn.geeks.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.learn.geeks.Utils;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		printLevelOrder(Utils.getTree());
		System.out.println();
		printLevelOrderOnNewLine(Utils.getTree());
		System.out.println();
		printReverseLevelOrderOnNewLine(Utils.getTree());
	}
	
	public static void printLevelOrder(Node node) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			
			if(temp.left != null)
				queue.add(temp.left);
			if(temp.right != null)
				queue.add(temp.right);
			
			System.out.print(temp.value+" ");
		}
	}
	
	public static void printLevelOrderOnNewLine(Node node) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		queue.add(null);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			
			if(temp == null) {
				if(!queue.isEmpty())
				queue.add(null);
				System.out.println();
			} else {
				System.out.print(temp.value+" ");
				
				if(temp.left != null)
					queue.add(temp.left);
				if(temp.right != null)
					queue.add(temp.right);
			}
		}
	}
	
	public static void printReverseLevelOrderOnNewLine(Node node) {
		Queue<Node> queue = new LinkedList<>();
		Stack<Node> stack = new Stack<>();
		queue.add(node);
		queue.add(null);
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			
			if(temp == null) {
				if(!queue.isEmpty()) {
					queue.add(null);
					stack.push(null);
				}
			} else {
				stack.push(temp);
				
				if(temp.right != null)
					queue.add(temp.right);
				if(temp.left != null)
					queue.add(temp.left);
			}
		}
		
		while(!stack.isEmpty()) {
			Node temp = stack.pop();
			if(temp == null) 
				System.out.println();
			else
				System.out.print(temp.value+" ");
		}
	}

}
