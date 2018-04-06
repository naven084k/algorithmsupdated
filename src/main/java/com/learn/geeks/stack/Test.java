package com.learn.geeks.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		int[] prices= {5,5,5,5};

		if(prices == null)
            return;
        long total=0;
        Stack<Integer> stack = new Stack<>();
        List<Integer> discounts = new ArrayList<>();
        for(int i=prices.length-1;i>=0;i--){
            if(stack.isEmpty()){
                total += prices[i]; 
                discounts.add(i);
            }
            else {
                while(!stack.isEmpty() && stack.peek() > prices[i]){
                    stack.pop();
                }
                
                if(stack.isEmpty()){
                	discounts.add(i);
                }
                total = total + prices[i]- ( stack.isEmpty() ? 0 : stack.peek() ) ;
            }
            stack.push(prices[i]);
        }
        System.out.println(total);
        Collections.reverse(discounts);
        for(Integer i:discounts){
            System.out.print(i+" ");
        }
	}
}
