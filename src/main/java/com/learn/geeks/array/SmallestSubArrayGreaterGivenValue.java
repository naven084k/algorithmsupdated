package com.learn.geeks.array;

public class SmallestSubArrayGreaterGivenValue {

	public static void main(String[] args) {
		int arr[]= {1,4,4,3,40,5,5,45};
		int value=50;
		int sumSofar=0;
		int fromIndex=0;
		int endIndex=0;
		for(int i=0;i<arr.length;i++) {
			sumSofar = sumSofar+arr[i];
			if(sumSofar >= value) {
				endIndex = i;
				for(int j=fromIndex;j<=i && sumSofar >= value;j++) {
					sumSofar = sumSofar-arr[j];
					fromIndex++;
				}
			}
		}
		
		System.out.println("sub array with max sum is from "+(fromIndex-1)+" "+endIndex);
	}
}
