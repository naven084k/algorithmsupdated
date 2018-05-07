package com.learn.geeks.stack;

import java.util.Stack;

public class StackSorting {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		for(int i=1;i<=5;i++) {
			stack.push(i);
		}
		
		sortStack(stack);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
	
	public static void sortStack(Stack<Integer> stack) {
		if(stack.empty())
			return;
		int d = stack.pop();
		sortStack(stack);
		sortUtil(stack,d);
	}
	
	public static void sortUtil(Stack<Integer> stack,int data) {
		if(stack.empty()) {
			stack.push(data);
		} else {
			if(stack.peek() < data) {
				stack.push(data);
			} else {
				int d = stack.pop();
				sortUtil(stack,data);
				stack.push(d);
			}
		}
	}
}
