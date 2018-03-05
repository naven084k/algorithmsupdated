package com.learn.geeks.array;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		
		int[] arr= {98,23,54,12,20,7,27};
		
		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		for(int i=1;i<arr.length;i++) {
			while(stack.peek() < arr[i]) {
				System.out.println("next greater element of "+stack.pop()+" is "+arr[i]);
			}
				stack.push(arr[i]);
		}
		while(!stack.isEmpty()) {
			System.out.println("next greater element of "+stack.pop()+" is null");
		}
	}
}
