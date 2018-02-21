package com.learn.geeks.tree;

public class PostOrderTraversalFromInNPre {

	static int preIndex=0;
	public static void main(String[] args) {

		int in[] = {4, 2, 5, 1, 3, 6};
		   int pre[] =  {1, 2, 4, 5, 3, 6};
		   printPostOrder(in, pre, 0,in.length-1);
	}
	
	public static void printPostOrder(int in[],int[] pre,int start,int end) {
		  if(start > end)
			  return;
		  	int index = findIndex(in,start,end,pre[preIndex++]);
			printPostOrder(in, pre, start,index-1);
			printPostOrder(in, pre, index+1,end);
			System.out.print(in[index]+" ");
	}
	
	public static int findIndex(int[] in,int start,int end,int element) {
		int i=0;
		for(i=start;i<end;i++) {
			if(in[i] == element) {
				return i;
			}
		}
		return start;
	}

}
