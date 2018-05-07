package com.learn.geeks.dp;

public class LongestCommonSubstring {

	public static void main(String[] args) {
		
		String a="xaa";
		String b="axa";
		
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
		System.out.println(longestCommonSubString(a,b,0,0,0));
	}
	
	public static int longestCommonSubString(String str1,String str2,int len1,int len2,int calculatedSofar) {
		if(len1 == str1.length() || len2 == str2.length())
			return calculatedSofar;
		if(str1.charAt(len1) == str2.charAt(len2)) {
			return longestCommonSubString(str1,str2,len1+1,len2+1,1+calculatedSofar);
		} else {
			return Math.max(longestCommonSubString(str1,str2,len1+1,len2,0) , longestCommonSubString(str1,str2,len1,len2+1,0));
		}
			
	}
	
}
