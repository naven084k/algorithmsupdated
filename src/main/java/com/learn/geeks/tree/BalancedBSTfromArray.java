package com.learn.geeks.tree;

public class BalancedBSTfromArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		TreeTraversals.inorder(balancedBST(arr,0,arr.length-1));
	}
	public static Node balancedBST(int arr[],int start,int end) {
		
		if(start > end)
			return null;
		int mid = (start+end)/2;
		Node root = new Node(arr[mid]);
		root.left =balancedBST(arr,start,mid-1);
		root.right =balancedBST(arr,mid+1,end);
		
		return root;
		
	}
}
