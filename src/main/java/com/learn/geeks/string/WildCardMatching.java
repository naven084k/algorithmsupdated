package com.learn.geeks.string;

public class WildCardMatching {

	public static void main(String[] args) {
		System.out.println(isMatch("xaylmz", "x?y*z"));
	}
	
	public static boolean isMatch(String s,String p) {
		
		boolean[][] T=new boolean[s.length()+1][p.length()+1];
		
		if(p.charAt(0)=='*')
			T[0][1]=true;
		
		T[0][0]=true;
		
		for(int i=1;i<=s.length();i++) {
			for(int j=1;j<=p.length();j++) {
				if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?')
					T[i][j] = T[i-1][j-1];
				else if(p.charAt(j-1) == '*')
					T[i][j] = T[i][j-1]||T[i-1][j];
			}
		}

		return T[s.length()][p.length()];
			
	}
}
