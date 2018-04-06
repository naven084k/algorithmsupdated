package com.learn.geeks.string;

public class KMPPatternMatching {

	public static void main(String[] args) {
		String haystack = "abxabcabcaby";
		String needle="abcaby";
		System.out.println(naiveFindIndex(haystack, needle));
		System.out.println(findUsingKMP(haystack,needle));;
		
	}
	public static int naiveFindIndex(String haystack,String needle) {
		if(needle.isEmpty() || haystack.isEmpty()|| needle.length() > haystack.length())
			return -1;
		else {
			for(int i=0; i<haystack.length(); i++){
		        if(i + needle.length() > haystack.length())
		            return -1;
		 
		        int m = i;
		        for(int j=0; j<needle.length(); j++){
		            if(needle.charAt(j)==haystack.charAt(m)){
		                if(j==needle.length()-1)
		                    return i;
		                m++;
		            }else{
		                break;
		            }
		 
		        }    
		    }   
			return -1;
		}
			
		
	}
	
	public static int findUsingKMP(String haystack,String needle) {
		int[] kmpArr = buildKMPArray(needle);
		
		if(needle.isEmpty() || haystack.isEmpty()|| needle.length() > haystack.length())
			return -1;
		else {
			int i=0;
			int j=0;
			int index = -1;
			while(j<needle.length() && i<haystack.length()) {
				if(haystack.charAt(i) == needle.charAt(j)) {
					if(j == needle.length() - 1) 
						return i-j;
					i++;
					j++;
				} else {
					   if(j != 0)
						  j=kmpArr[j-1];
					   else
						   i++;
					}
				}
			
			return index;
		}
		
	}
	
	public static int[] buildKMPArray(String needle) {
		int arr[] = new int[needle.length()];
		int i=1;
		int j=0;
		
		while(i<needle.length()) {
			if(needle.charAt(i) == needle.charAt(j)) {
				arr[i]=j+1;
				i++;
				j++;
			} else {
				if(j != 0)
					j = arr[j-1];
				else{
					arr[i]= 0;
					i++;
					}
				
			}
		}
		
		return arr;
	}
}
