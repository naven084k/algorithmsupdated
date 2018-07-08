package com.learn.geeks.tree;

public class PrintAllNodesAtDistanceK {

	public static void main(String[] args) {
		Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        Node target = root.left.right;
        findNPrintKnodes(root, target, 2);
		
	}
	
	public static void printKDistanceNodes(Node root,int k) {
		if(root  != null){
			
			if(k == 0)
				System.out.println(root.value);
			else {
				printKDistanceNodes(root.left,k-1);
				printKDistanceNodes(root.right,k-1);
			}
		}
	}
	
	public static int findNPrintKnodes(Node root,Node target,int k) {
		if(root == null)
			return -1;
		if(root.value == target.value) {
			printKDistanceNodes(root,k);
			return 0;
		} 
		int retVal = findNPrintKnodes(root.left,target,k);
		if(retVal != -1) {
			
			if(retVal + 1 == k) {
				System.out.println(root.value);
			}else {
				printKDistanceNodes(root.right,k-retVal-2);
			}
			
			return 1+retVal;
		} 
		
		retVal = findNPrintKnodes(root.right,target,k);
		
		if(retVal != -1) {

			if(retVal + 1 == k) {
				System.out.println(root.value);
			}else {
				printKDistanceNodes(root.left,k-retVal-2);
			}
			
			return 1+retVal;
		} 
		return -1;
	}

}
