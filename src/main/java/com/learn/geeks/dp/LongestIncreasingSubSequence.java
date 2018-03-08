package com.learn.geeks.dp;

import java.util.Arrays;

public class LongestIncreasingSubSequence {

	public static void main(String[] args) {
		int arr[]= {0,4,12,2,10,6,9,13,3,11,7,15};
		int[] lengthArr = new int[arr.length];
		int[] indexArr = new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			lengthArr[i]=1;
		}
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j] < arr[i] && ((lengthArr[j]+1) >= lengthArr[i])) {
					lengthArr[i] = lengthArr[j]+1;
					indexArr[i]=j;
				}
			}
		}
		System.out.println(Arrays.toString(lengthArr));
		
		int maxAt = 0;

		for (int i = 0; i < lengthArr.length; i++) {
		    maxAt = lengthArr[i] > lengthArr[maxAt] ? i : maxAt;
		}
		
		for(int i=maxAt; i > 0;) {
			System.out.print(arr[i]+" ");
			i = indexArr[i];
		}
		
	}
}
