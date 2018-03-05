package com.learn.geeks.array;

public class RainWaterTrapping {

	public static void main(String[] args) {
		int arr[] = {1,5,2,3,1,7,2,4};
		int[] rightMaxArr = new int[arr.length];
		int maxSeenRight = 0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i] > maxSeenRight) {
				maxSeenRight = arr[i];
			} 
			rightMaxArr[i] = maxSeenRight;
		}
		
		int maxSeenLeft = 0;
		int result = 0;
		for(int i=0;i< arr.length;i++) {
			result = result + Integer.max(Integer.min(rightMaxArr[i], maxSeenLeft)-arr[i], 0);
			if(arr[i] > maxSeenLeft) {
				maxSeenLeft = arr[i];
			}
		}
		System.out.println(result);

	}

}
