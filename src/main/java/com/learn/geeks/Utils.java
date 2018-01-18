package com.learn.geeks;

import com.learn.geeks.book.tree.TreeNode;

public class Utils {

	public static TreeNode getTree() {
		TreeNode root = new TreeNode();
		root.value = "1";
		
		root.left = new TreeNode();
		root.left.value ="6";
		
		root.right = new TreeNode();
		root.right.value ="7";
		
		root.left.left = new TreeNode();
		root.left.left.value ="3";
		
		root.left.right = new TreeNode();
		root.left.right.value ="4";
		
		root.right.left = new TreeNode();
		root.right.left.value ="8";
		
		root.right.right = new TreeNode();
		root.right.right.value ="9";
		
		/*  tree will be 
		      1
		      
		   6      7
		    
		3    4  8    9    
		  
		 */
		
		return root;
	}
}
