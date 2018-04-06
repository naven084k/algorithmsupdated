package com.learn.geeks.stack;

import java.util.Stack;

public class LongestValidSubString {

	public static void main(String[] args) {


		String str="(()";
		int maxLength = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '(') {
				stack.push(i);
			} else {
				stack.pop();
				if(!stack.isEmpty()) {
					int temp = i - stack.peek();
					maxLength = Math.max(maxLength, temp);
				} else 
					stack.push(i);
					
			}
		}
		System.out.println("valid maximum substring = "+maxLength);
	}

}
