package com.learn.geeks;

import com.learn.geeks.tree.Node;

public class Utils {

	public static Node getTree() {
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
		
		/*  tree will be 
		      1
		      
		   2      3
		    
		 4   5  6    7    
		 
		 1  2 4 5 3 6 7
		 4 2 5 1 6 3 7
		  
		 */
		
		return node;
	}
}
