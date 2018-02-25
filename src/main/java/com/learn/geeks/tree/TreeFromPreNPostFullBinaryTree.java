package com.learn.geeks.tree;

public class TreeFromPreNPostFullBinaryTree {

	static int preOrderIndex = 0;
	public static void main(String[] args) {

		int pre[] = { 1, 2, 4, 8, 9, 5, 3, 6, 7 };
        int post[] = { 8, 9, 4, 5, 2, 6, 7, 3, 1 };
        TreeTraversals.inorder(buildTree(pre,post,0,pre.length-1));
	}
	
	public static Node buildTree(int pre[],int post[],int start,int end) {
		if(start > end || preOrderIndex >= pre.length) {
			return null;
		} 
		
		Node node = new Node(pre[preOrderIndex++]);
		if(start == end || preOrderIndex >= pre.length) {
			return node;
		}
		int index;
        for (index = start; index <= end; index++) 
        {
            if (post[index] == pre[preOrderIndex])
                break;
        }
		if(index <= end) {
			node.left = buildTree(pre,post,start,index);
			node.right = buildTree(pre,post,index+1,end);
		}
		
		return node;
	}
	

}
