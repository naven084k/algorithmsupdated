package com.learn.geeks;

import com.learn.geeks.book.tree.Node;

public class Utils {

	public static Node getTree() {
		Node root = new Node();
		root.value = 1;
		
		root.left = new Node();
		root.left.value =6;
		
		root.right = new Node();
		root.right.value =7;
		
		root.left.left = new Node();
		root.left.left.value =3;
		
		root.left.right = new Node();
		root.left.right.value =4;
		
		root.right.left = new Node();
		root.right.left.value =8;
		
		root.right.right = new Node();
		root.right.right.value =9;
		
		/*  tree will be 
		      1
		      
		   6      7
		    
		3    4  8    9    
		  
		 */
		
		return root;
	}
}
