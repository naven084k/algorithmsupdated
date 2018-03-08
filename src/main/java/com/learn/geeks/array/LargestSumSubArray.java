package com.learn.geeks.array;

public class LargestSumSubArray {

	public static void main(String[] args) {
		
		 int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		 int maxSum = Integer.MIN_VALUE;
		 int maxEndsHere = 0;
		 
		 for(int i=0;i<a.length;i++) {
			 maxEndsHere = maxEndsHere + a[i];
			 
			 if(maxSum < maxEndsHere)
				 maxSum = maxEndsHere;
				 
			 if(maxEndsHere < 0) {
				 maxEndsHere = 0;
			 } 
		 }
		 
		 System.out.println(maxSum);
	}
}
