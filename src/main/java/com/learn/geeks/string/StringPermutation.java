package com.learn.geeks.string;

import java.util.HashMap;
import java.util.Map;

public class StringPermutation {
	public static void main(String[] args) {

		Map<Character,Integer> countMap = new HashMap<>();
		String input="AABC";
		char result[] = new char[input.length()];
		for(int i=0;i<input.length();i++) {
			if(countMap.containsKey(input.charAt(i))) {
				countMap.put(input.charAt(i), countMap.get(input.charAt(i))+1);
			} else {
				countMap.put(input.charAt(i), 1);
			}
		}
		
		 char str[] = new char[countMap.size()];
	        int count[] = new int[countMap.size()];
	        int index = 0;
	        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
	            str[index] = entry.getKey();
	            count[index] = entry.getValue();
	            index++;
	        }
	        
		printPermutations(str,count,result,0);
	}
	
	public static void printPermutations(char str[], int count[], char result[], int level) {
		
		if(level == result.length) {
			System.out.println(String.valueOf(result));
		} else {
			for(int i=0;i<str.length;i++) {
				if(count[i] == 0){
					continue;
				} else {
					result[level]=str[i];
					count[i]--;
					printPermutations(str,count,result,level+1);
					count[i]++;
				}
			}
		}
	}
}
