package com.learn.geeks.string;

public class RegularExpressionMatching {

	public static void main(String[] args) {
		System.out.println(isMatch("xaabyc", "xa*b.c"));
	}
	
	public static boolean isMatch(String s,String p) {
		
		boolean[][] T=new boolean[s.length()+1][p.length()+1];
		
		T[0][0]=true;
		
		for(int i=1;i<p.length();i++) {

			if(p.charAt(i-1)=='*')
				T[0][i]=T[0][i-2];
		}
		
		for(int i=1;i<s.length()+1;i++) {
			for(int j=1;j<p.length()+1;j++) {
				if(s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '.')
					T[i][j] = T[i-1][j-1];
				else if(p.charAt(j-1) == '*') {
					T[i][j] = T[i][j-2];
					if(!T[i][j] && (p.charAt(j-2) == s.charAt(i-1) || p.charAt(j-2)=='.')) {
						T[i][j] = T[i-1][j];
					} 
				}
			}
		}

		return T[s.length()][p.length()];
			
	}
}
