package com.learn.geeks.tree;

public class TreeFromInOrderNLevelOrder {

	static int levelOrderIndex = 0;
	public static void main(String[] args) {

		int in[] = new int[]{4, 8, 10, 12, 14, 20, 22};
        int level[] = new int[]{20, 8, 22, 4, 12, 10, 14};
        TreeTraversals.inorder(buildTree(in,level,0,in.length-1));
	}
	
	public static Node buildTree(int in[],int level[],int start,int end) {
		if(start > end) {
			return null;
		} 
		if(start == end) {
			return new Node(in[start]);
		}
		int index = findIndex(in,level,start,end);
		Node node = new Node(in[index]);
		node.left = buildTree(in,level,start,index-1);
		node.right = buildTree(in,level,index+1,end);
		
		return node;
	}
	
	public static int findIndex(int[] in,int[] level,int start,int end) {
		for(int i=0;i<level.length;i++) {
			for(int j=start;j<end;j++) {
				if(level[i] == in[j])
					return j;
			}
		}
		return -1;
	}

}
