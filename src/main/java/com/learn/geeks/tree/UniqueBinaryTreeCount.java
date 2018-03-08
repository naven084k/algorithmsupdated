package com.learn.geeks.tree;

public class UniqueBinaryTreeCount {

	public static void main(String[] args) {

		int n=3;
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=-1;
		}
		System.out.println(numberOfBsts(n, arr));
	}
	
	public static int numberOfBsts(int n,int[] solutions) {
		int count=0;
		
		if(n < 0) return 0;
		if(n ==1 || n== 0) return 1;
		
		for(int i=0;i<n;i++) {
			if(solutions[i] == -1)
				solutions[i] = numberOfBsts(i,solutions);
 			if(solutions[n-1-i] == -1)
				solutions[n-1-i] = numberOfBsts(n-1-i,solutions);
			
			count += solutions[i]*solutions[n-1-i];
		}
		return count;
	}

}
