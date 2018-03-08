package com.learn.geeks.array;

public class BinaryStringsWithOutConsecutiveOnes {

	public static void main(String[] args) {
		
		int a=1,b=1;
		int n=4;
		for(int i=2;i<=n;i++) {
			int temp = a;
			a = a+b;
			b=temp;
		}
		
		System.out.println("total possible strings "+(a+b));
		
	}
}
