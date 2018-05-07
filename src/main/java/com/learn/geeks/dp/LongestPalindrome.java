package com.learn.geeks.dp;

public class LongestPalindrome {

	public static void main(String[] args) {
		
		String str="gexxeg";
		
		boolean memory[][]=new boolean[str.length()][str.length()];
		int maxLength=1;
		int start=0;
		for(int i=0;i<str.length();i++) {
			memory[i][i]=true;
		}
		
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				start=i;
				maxLength=2;
				memory[i][i+1]=true;
			} 
		}
		
		for(int k=3;k<=str.length();k++) {
			
			for(int i=0;i<str.length()-k+1;i++) {
				int j = i+k-1;
				if(memory[i+1][j-1] && str.charAt(i) == str.charAt(j)) {
					memory[i][j] = true;
					if(k>maxLength) {
						maxLength=k;
						start=i;
					}
				}
			}
		}
		System.out.println(str.substring(start, start+maxLength));
	}
}
