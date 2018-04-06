package com.learn.geeks.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubStringConcatinationOfAllWords {

	public static void main(String[] args) {
		
		String str="barfoothefoobarman";
		List<String> words = new ArrayList<>();
		words.add("bar");
		words.add("foo");
		
		int len = 3;
		for(int i=0;i<len;i++) {
			Map<String,Integer> map = new HashMap<>();
			int count = 0;
			int start=i;
			for(int j=i;j<=str.length()-len;j+=len) {
				String currentWord = str.substring(j, j+len);
				if(words.contains(currentWord)) {
					
					if(!map.containsKey(currentWord)) {
						map.put(currentWord, 1);
					} else {
						map.put(currentWord, map.get(currentWord)+1);
					}
					count++;
					
					while(map.get(currentWord) > 1) {
						String remaining = str.substring(start,start+len);
						map.put(remaining, map.get(remaining)-1);
						count--;
						start = start+len;
					}
					
					if(count == words.size()) {
						System.out.println(start);
						
						String remaining = str.substring(start,start+len);
						map.put(remaining, map.get(remaining)-1);
						count--;
						start = start+len;
					}
					
				} else {
					count = 0;
					map.clear();
					start = j+len;
				}
			}
		}
		
	}
	
}
