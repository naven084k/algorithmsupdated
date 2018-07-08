package com.learn.geeks.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnagramsTogether {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(new String[]{"car", "ape", "meal", "pea", "male", "arc", "lame", "dog"});
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				char[] chars1 = o1.toCharArray();
				char[] chars2 = o2.toCharArray();
				return new String(chars1).compareTo(new String(chars2));
			}
			
		});
		
		System.out.println(list);
		
	}
	
}
