package com.learn.geeks.string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {

	public static void main(String[] args) {
		
		String str="abcbbbbcccbdddadacb";
		Map<Character,Integer> map = new HashMap<>();
		int kDistinctCnt=2;
		map.put(str.charAt(0), 1);
		
		int start = 0; int end=0; int windowSize=1; int windowStart=0;
		for(int i=1;i<str.length();i++) {
			if(map.get(str.charAt(i)) == null) {
				map.put(str.charAt(i), 1);
			} else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			
			end++;
			while(!lessThanK(map,kDistinctCnt)) {
				map.put(str.charAt(start), map.get(str.charAt(start))-1);
				start++;
			}
			
			if((end-start+1>windowSize)) {
				windowSize = end-start+1;
				windowStart = start;
			}
		}
		
		System.out.println(str.substring(windowStart, windowStart+windowSize));
	}

	private static boolean lessThanK(Map<Character, Integer> map,int m) {
		int unqueCharCount = 0;
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue() > 0) {
				unqueCharCount++;
			}
		}
		return unqueCharCount<=m;
	}
}
