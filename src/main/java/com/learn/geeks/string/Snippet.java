package com.learn.geeks.string;

public class Snippet {
	public static void main(String[] args) {
		findDuplicate("abla");
	}
	public static void findDuplicate(String str) {
	        int checker = 0;
	        char c = 'a';
	        for (int i = 0; i < str.length(); ++i) {
	            int val = str.charAt(i) - c;
	            System.out.println("value is "+val);
	            if ((checker & (1 << val)) > 0) {
	                System.out.println((char)(c+val));
	            }else{
	                       checker |= (1 << val);  
	                       System.out.println("checker is "+checker);
	                    }
	
	        }
	    }
}

