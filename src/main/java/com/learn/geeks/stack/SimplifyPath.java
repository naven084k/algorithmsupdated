package com.learn.geeks.stack;

import java.util.LinkedList;
import java.util.Stack;

public class SimplifyPath {
	
	public static void main(String[] args) {
		SimplifyPath sp = new SimplifyPath();
		int[] i= {1};
		sp.increment(i);
		System.out.println(i[i.length-1]);
	}
	void increment(int[] arr) {
		arr[arr.length-1]++;
	}
}
