package com.learn.geeks.dp;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		
		String a="abcdf";
		String b="xybcdf";
		
		int[][] count=new int[b.length()+1][a.length()+1];
		int max=0;
		for(int i=1;i<=b.length();i++) {
			for(int j=1;j<=a.length();j++) {
				
				if(b.charAt(i-1) == a.charAt(j-1)) {
					count[i][j]=count[i-1][j-1]+1;
					max = Math.max(max, count[i][j]);
				}
			}
		}
		
		System.out.println(max);
		
	}
	
}
