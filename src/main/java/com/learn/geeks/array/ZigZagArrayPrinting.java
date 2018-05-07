package com.learn.geeks.array;

public class ZigZagArrayPrinting {

	public static void main(String[] args) {
		
		int arr[] = new int[]{4, 3, 7, 8, 6, 2, 1};
		
		boolean flg = true;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(flg) {
				if(arr[i] > arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i]=temp;
				}
			}
			else {
				if(arr[i] < arr[i+1]) {
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i]=temp;
				}
			}
			flg = !flg;
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}
