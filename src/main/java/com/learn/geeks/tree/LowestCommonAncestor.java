package com.learn.geeks.tree;

import static com.learn.geeks.Utils.*;

import com.learn.geeks.Utils;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		System.out.println(lowestCommonAncestor(Utils.getTree(),4,7).value);
	}
	
	public static Node lowestCommonAncestor(Node root, int a,int b) {
		
		if(root == null)
			return null;
			
		if(root.value == a || root.value == b)
			return root;
		
		 Node left = lowestCommonAncestor(root.left, a,b);
		 Node right = lowestCommonAncestor(root.left, a,b);
		 
		 if(left != null && right != null)
			 return root;
		 else if(left == null)
			 return right;
		 else return  left;
	}
}

