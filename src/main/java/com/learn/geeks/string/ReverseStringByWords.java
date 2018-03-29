package com.learn.geeks.string;

public class ReverseStringByWords {

	public static void main(String[] args) {
		String str = "the sky is blue";
		String[] s = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for(String t:s) {
			sb.append(reverse(t));
			sb.append(" ");
		}
		
		System.out.println(sb.reverse());
		
	}

	private static String reverse(String str) {
		char[] temparray = str.toCharArray();
        int left, right=0;
        right = temparray.length-1;
 
        for (left=0; left < right ; left++ ,right--)
        {
            // Swap values of left and right
            char temp = temparray[left];
            temparray[left] = temparray[right];
            temparray[right]=temp;
        }
        
        return new String(temparray);
	}
}
