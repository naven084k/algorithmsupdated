package com.learn.geeks.array;

public class FindPeakElement {

	public static void main(String[] args) {
		int arr[] = {42,41,40,39};
		//findPeakElementBruteForce(arr);
		findPeakElement(arr);
	}
	
	public static void findPeakElementBruteForce(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			
			if(i == 0) {
				if(arr[i] > arr[i+1])
					System.out.println(arr[i]);
			} else if(i == arr.length -1) {
				if(arr[i] > arr[i-1])
					System.out.println(arr[i]);
			} else {
				if(arr[i-1] < arr[i] && arr[i] > arr[i+1])
					System.out.println(arr[i]);
			}
		}
	}
	
	public static void findPeakElement(int[] arr) {
		
		if(arr != null && arr.length > 0) {
			
			int start = 0;
			int end = arr.length-1;
			
			while(start <= end) {
				int mid = (start+end)/2;	
			
				if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])) {
					System.out.println(arr[mid]);
					break;
				}
				if(mid > 0 && arr[mid-1] > arr[mid])
					end = mid-1;
				else 
					start = mid+1;
			}
		}
	}
}
