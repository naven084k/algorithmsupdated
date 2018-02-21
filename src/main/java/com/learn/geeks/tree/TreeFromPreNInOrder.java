package com.learn.geeks.tree;

public class TreeFromPreNInOrder {

	static int preOrderIndex=0;
	public static void main(String[] args) {
		Node root = buildTree(new int[] {1,2,4,5,3,6,7},new int[] {4,2,5,1,6,3,7},0,6);
		System.out.println(root);
	}
	
	public static Node buildTree(int[] preorder,int[] inorder,int start,int end) {
		if(start > end) {
			return null;
		}
		Node node = new Node(preorder[preOrderIndex]);
		preOrderIndex++;
		
		if(start == end)
			return node;
		
		int index = findIndex(inorder, node.value);
		node.left = buildTree(preorder, inorder, start, index-1);
		node.right = buildTree(preorder, inorder, index+1, end);
		return node;
		
	}
	
	public static int findIndex(int[] arr,int element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == element) {
				return i;
			}
		}
		return -1;
	}
}
