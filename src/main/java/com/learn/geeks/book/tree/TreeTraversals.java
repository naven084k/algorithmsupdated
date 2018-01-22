package com.learn.geeks.book.tree;

import java.util.Stack;

import com.learn.geeks.Utils;

public class TreeTraversals {
 
	 public static void main(String[] args) {
		/*preorder(Utils.getTree());
		System.out.println();
		inorder(Utils.getTree());
		System.out.println();*/
		postorderWith2Stacks(Utils.getTree());
		System.out.println();
		postorderWith1Stack(Utils.getTree());
	}
	 
	 public static void preorder(Node root) {
		 Stack<Node> stack = new Stack<>();
		 while(true) {
			 while (root != null) {
				 System.out.print(root.value+" ");
				 stack.push(root);
				
				 root = root.left;
			 } 
			 
			 if(stack.isEmpty())
				 break;
			 
			 root = stack.pop();
			 root = root.right;
		 }
	 }
	 
	 public static void inorder(Node root) {
		 Stack<Node> stack = new Stack<>();
		 while(true) {
			 while (root != null) {
				 stack.push(root);
				 root = root.left;
			 } 
			 
			 if(stack.isEmpty())
				 break;
			 root = stack.pop();
			 System.out.print(root.value+" ");
			 root = root.right;
		 }
	 }
	 
	 public static void postorderWith2Stacks(Node root) {
		 Stack<Node> stack1 = new Stack<>();
		 Stack<Node> stack2 = new Stack<>();
		 stack1.push(root);
		 while(true) {
			 while (root != null) {
				 if(stack1.isEmpty())
					 break;
				 
				 root = stack1.pop();

				 if(root.left != null)
					 stack1.push(root.left);
				 
				 if(root.right != null)
					 stack1.push(root.right);
				 
				 stack2.push(root);
			 } 
			 
			 while(!stack2.isEmpty()) {
				 root = stack2.pop();
				 System.out.print(root.value+" ");
			 }
			 if(stack2.isEmpty())
				 break;
		 }
	 }
	 
	 public static void postorderWith1Stack(Node root) {
		 Stack<Node> stack = new Stack<>();
		 Node current = root;
			 while (current != null || !stack.isEmpty()) {
				 if(current != null) {
					 stack.push(current);
					 current = current.left;
				 } else {
					 Node temp = stack.peek().right;
					 if(temp == null) {
						 temp = stack.pop();
						 System.out.print(temp.value+" ");
						 while(!stack.isEmpty() && stack.peek().right == temp) {
							 temp = stack.pop();
							 System.out.print(temp.value+" ");
						 } 
					 } else {
						 current = temp;
					 }
				 }
			 }}

}

