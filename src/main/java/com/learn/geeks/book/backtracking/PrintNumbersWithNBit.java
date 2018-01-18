package com.learn.geeks.book.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class PrintNumbersWithNBit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter k to print k-ary numbers");
		int k=scanner.nextInt();
		k_ary(3,new int[3],k);

	}
	
	static void k_ary(int n,int[] a,int k) {
		if(n == 0)
			System.out.println(Arrays.toString(a));
		else {
			for(int i=0;i<=k;i++) {
				a[n-1] = i;
				k_ary(n-1,a,k);
			}
		}
	}

}
