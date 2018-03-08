package com.learn.geeks.dp;

public class LongestPalindromicSubSequence {

	public static void main(String[] args) {

		String str="LPASPAL";
		
		int[][] arr = new int[str.length()][str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i][i]=1;
		}
		
		for(int len=2;len<=str.length();len++) {
			for(int i=0;i<str.length()-len+1;i++) {
				int j=i+len-1;
				if(str.charAt(i) == str.charAt(j)) {
					arr[i][j]=2+arr[i+1][j-1];
				} else {
					arr[i][j]=Math.max(arr[i][j-1],arr[i+1][j]);
				}
			}
		}
		System.out.println("max length string is "+arr[0][str.length()-1]);
	}

}
