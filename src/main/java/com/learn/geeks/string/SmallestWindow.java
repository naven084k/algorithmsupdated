package com.learn.geeks.string;

public class SmallestWindow {

	public static void main(String[] args) {

		String input="geeksforgeeks";
		String pattern="ork";
		
		int str[]=new int[256];
		int pat[]=new int[256];
		
		for(int i=0;i<pattern.length();i++) {
			pat[pattern.charAt(i)]++;
		}
		int count=0;
		int start = -1;
		
		for(int i=0;i<input.length();i++) {
			str[input.charAt(i)]++;
			
			if(pat[input.charAt(i)] > 0 && pat[input.charAt(i)] <= str[input.charAt(i)]) {
				if(start == -1)
					start=i;
			  count++;	
			}
			if(count == pattern.length()) {
				System.out.println(input.substring(start, i+1));
				count--;
				start++;
			}
		}
	}
	
}
