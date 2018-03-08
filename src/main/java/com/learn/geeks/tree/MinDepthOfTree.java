package com.learn.geeks.tree;

public class MinDepthOfTree {

	public static void main(String[] args) {
		
	        Node root = new Node(1);
	        root.left = new Node(2);
	        root.right = new Node(3);
	        root.left.left = new Node(4);
	        root.left.right = new Node(5);
	        System.out.println(getMinDepth(root));
	}
	
	public static int getMinDepth(Node root) {
		if(root == null)
			return 0;
		if(root.left == null && root.right == null)
			return 1;
		int left = Integer.MAX_VALUE;
		if(root.left != null)
			left = getMinDepth(root.left);
		
		int right = Integer.MAX_VALUE;
		if(root.right != null)
			right = getMinDepth(root.right);
		
		return 1+Integer.min(left, right);
	}
}
