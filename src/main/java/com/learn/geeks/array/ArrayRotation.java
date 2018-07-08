package com.learn.geeks.array;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		reverse(a,0,1);
		reverse(a,2,a.length-1);
		reverse(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void reverse(int[] a,int l,int r) {
		while(l<r) {
			int temp = a[r];
			a[r]=a[l];
			a[l]=temp;
			l++;
			r--;
		}
	}
}
