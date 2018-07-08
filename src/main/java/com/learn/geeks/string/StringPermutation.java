package com.learn.geeks.string;

import java.util.Arrays;

public class StringPermutation {
	public static void main(String[] args) {
		permutataion("ABC".toCharArray(),0,3);
	}

	public static void permutataion(char[] arr, int start, int end) {

		if(start == end) {
			System.out.println(Arrays.toString(arr));
		} else {
			for(int i=start;i<end;i++) {
				swap(arr,start,i);
				permutataion(arr,start+1,end);
				swap(arr,start,i);
				
			}
		}
	}


	public static void swap(char[] arr, int i, int j) {
		char c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}

}
