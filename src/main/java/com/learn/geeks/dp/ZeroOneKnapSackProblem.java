package com.learn.geeks.dp;

public class ZeroOneKnapSackProblem {

	public static void main(String[] args) {

		int values[]= {1,4,5,7};
		int weights[]= {1,3,4,5};
		System.out.println(findBestValueForAllowedWeight(weights, values, 7));
		System.out.println(recursiveKnapSack(weights, values, 0,7));
	}
	
	public static int findBestValueForAllowedWeight(int[] w,int[] values,int allowedWeight) {
		int[][] T=new int[w.length+1][allowedWeight+1];
		for(int i=0;i<=w.length;i++) {
			for(int j=0;j<=allowedWeight;j++) {
				if(i == 0 || j==0)
					continue;
				if(j < w[i-1]) {
					T[i][j] = T[i-1][j];
				} else {
					T[i][j]=Math.max(values[i-1]+T[i-1][j-w[i-1]], T[i-1][j]);
				}
			}
		}
		
		return T[w.length][allowedWeight];
	}
	

	public static int recursiveKnapSack(int weights[],int values[],int n,int weight) {
		
		if(weight == 0 || n == weights.length)
			return 0;
		if(weight < weights[n])
			return recursiveKnapSack(weights,values,n+1,weight);
		int withoutIncludig = recursiveKnapSack(weights,values,n+1,weight);
		int withIncluding = values[n]+recursiveKnapSack(weights, values, n+1, weight-weights[n]);
		return Math.max(withoutIncludig, withIncluding);
	}
}
