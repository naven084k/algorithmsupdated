package com.learn.geeks.strings;

public class LongestCommonSubSequence {

	public static void main(String[] args) {
		 	String str1 = "ABCDGHLQR";
	        String str2 = "AEDPHR";
	        System.out.println(longestCommonSubSequenceRecursive(str1,str2,0,0));
	        System.out.println(longestCommonSubSequenceDynamic(str1,str2));
	}
	
	public static int longestCommonSubSequenceRecursive(String str1,String str2,int len1,int len2) {
		if(len1 == str1.length() || len2 == str2.length())
			return 0;
		if(str1.charAt(len1) == str2.charAt(len2)) {
			return 1+longestCommonSubSequenceRecursive(str1,str2,len1+1,len2+1);
		} else {
			return Math.max(longestCommonSubSequenceRecursive(str1,str2,len1+1,len2) , longestCommonSubSequenceRecursive(str1,str2,len1,len2+1));
		}
			
	}
	
	public static int longestCommonSubSequenceDynamic(String str1,String str2) {
		int[][] T = new int[str1.length()+1][str2.length()+1];
		int max=0;
		for(int i=1;i<T.length;i++) {
			for(int j=1;j<T[i].length;j++) {
				
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					T[i][j] = T[i-1][j-1]+1;
				} else {
					T[i][j] = Math.max(T[i][j-1], T[i-1][j]);
				}
				
				if(T[i][j] > max){
                    max = T[i][j];
                }
			}
		}
		return max;
		
	}
}
