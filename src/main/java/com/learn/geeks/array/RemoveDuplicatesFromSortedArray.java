package com.learn.geeks.array;

public class RemoveDuplicatesFromSortedArray
{

	public static void main(String[] args) {
		removeDuplicates(new int[] {1, 2, 2, 3, 4, 4, 4, 5, 5});
	}
	
	public static void removeDuplicates(int[] a) {
		int i=0;
		int j=1;
		
		while(j<a.length) {
			
			if(a[i] == a[j]) {
				j++;
			} else {
				i++;
				a[i]=a[j];
				j++;
			}
		}
		for(int k=0;k<i+1;k++) {
			System.out.println(a[k]+" ");
		}
	}
}
