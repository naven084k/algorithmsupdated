package com.learn.geeks;

import com.learn.geeks.tree.Node;

public class Utils {

	public static Node getTree() {
		Node root = new Node();
		root.value = 1;
		
		root.left = new Node();
		root.left.value = 2 ;
		
		root.right = new Node();
		root.right.value =3;
		
		root.left.left = new Node();
		root.left.left.value =4;
		
		root.left.right = new Node();
		root.left.right.value =5;
		
		root.right.left = new Node();
		root.right.left.value = 6;
		
		root.right.right = new Node();
		root.right.right.value = 7;
		
		/*  tree will be 
		      1
		      
		   2      3
		    
		 4   5  6    7    
		  
		 */
		
		return root;
	}
}
