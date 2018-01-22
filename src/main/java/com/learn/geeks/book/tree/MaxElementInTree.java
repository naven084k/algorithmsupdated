package com.learn.geeks.book.tree;

import com.learn.geeks.Utils;

public class MaxElementInTree {

	public static void main(String[] args) {
		System.out.println(findMax(Utils.getTree()));
	}
	
	public static int findMax(Node root) {
		if(root == null){
			return Integer.MIN_VALUE;
		} else {
			int max = root.value;
			int left = findMax(root.left);
			int right = findMax(root.right);
			
			int temp = Math.max(left, right);
			max = Math.max(temp, max);
			return max;
		}
	}
}
