package com.learn.geeks.array;

import java.util.ArrayList;

public class MinimumTriangle {
		 public static void main(String[] args) {
			 ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
			 ArrayList<Integer> list = new ArrayList<>();
			list.add(2);
			
			mainList.add(list);
			
			 list = new ArrayList<>();
				list.add(3);
				list.add(4);
				
				mainList.add(list);
				
				list = new ArrayList<>();
				list.add(6);
				list.add(5);
				list.add(7);
				
				mainList.add(list);
				
				list = new ArrayList<>();
				list.add(4);
				list.add(1);
				list.add(8);
				list.add(3);
				
				mainList.add(list);
				
				System.out.println(minimumTotal(mainList));
			
		}
 
 public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		int[] total = new int[triangle.size()];
		int l = triangle.size() - 1;
	 
		for (int i = 0; i < triangle.get(l).size(); i++) {
			total[i] = triangle.get(l).get(i);
		}
	 
		// iterate from last second row
		for (int i = triangle.size() - 2; i >= 0; i--) {
			for (int j = 0; j < triangle.get(i + 1).size() - 1; j++) {
				total[j] = triangle.get(i).get(j) + Math.min(total[j], total[j + 1]);
			}
		}
	 
		return total[0];
	}
}
