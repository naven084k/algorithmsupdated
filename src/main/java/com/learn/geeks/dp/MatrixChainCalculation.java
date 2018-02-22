package com.learn.geeks.dp;

public class MatrixChainCalculation {

	public static void main(String[] args) {

		System.out.println(findCost(new int[] {4,2,3,5,3}));
	}

	public static int findCost(int a[]) {
		int temp[][] = new int[a.length][a.length];
		
		for(int l=2;l<a.length;l++) {
			for(int i=0;i<a.length-l;i++) {
				int j=i+l;
				 temp[i][j] = 1000000;
				for(int k=i+1;k<j;k++) {
					int q=temp[i][k]+temp[k][j]+a[i]*a[j]*a[k];
					temp[i][j] = Math.min(q, temp[i][j]);
				}
			}
		}
		
		return temp[0][a.length-1];
	}
	
}
