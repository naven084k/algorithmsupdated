package com.learn.geeks.string;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CheckTwoStringsIsomorphic {

	public static void main(String[] args) {
		List<String> input = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int n=Integer.parseInt(scanner.nextLine());
		for(int i=0;i<n*2;i++) {
			input.add(scanner.nextLine());
		}
		for(int i=0;i<n*2;i+=2) {
			System.out.println(areIsomorphic(input.get(i), input.get(i+1)));;
		}
		
	}

	private static int areIsomorphic(String a, String b) {
		if((a !=null && b == null) || (a == null && b != null) || (a == null && b==null)|| (a.length() != b.length()))
			return 0;
		
		Map<Character,Character> map = new LinkedHashMap<>();
		for(int i=0;i<a.length();i++) {
			if(!map.containsKey(a.charAt(i))) {
				if(map.values().contains(b.charAt(i)))
					return 0;
				map.put(a.charAt(i), b.charAt(i));
			} else {
				if(map.get(a.charAt(i)) != b.charAt(i))
					return 0;
			}
		}
		
		return 1;
	}
}
