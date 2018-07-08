package com.learn.geeks.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class Snippet {
	public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		int[] total = new int[triangle.size()];
		int l = triangle.size() - 1;
	 
		for (int i = 0; i < triangle.get(l).size(); i++) {
			total[i] = triangle.get(l).get(i);
		}
	 
		// iterate from last second row
		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
				total[j] = triangle.get(i).get(j) + Math.max(total[j], total[j + 1]);
			}
		}
	 
		return total[0];
	}
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> data=new ArrayList<>();
		
		String[] ip=new String[] {"1","2 3","4 5 6"};
		
		for(String str:ip) {
			ArrayList<Integer> arrayList = (ArrayList<Integer>) Arrays.asList(str.split(" ")).stream().map(t->{ return Integer.parseInt(t);}).collect(Collectors.toList());
			data.add(arrayList);
		}
		
		System.out.println(minimumTotal(data));
	}
}

