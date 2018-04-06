package com.learn.geeks.array;

import java.util.PriorityQueue;

public class findKthLargest {

	public static void main(String[] args) {
		findKthLargest(new int[]{3,2,1,5,6,4}, 2);
	}
	public static int findKthLargest(int[] nums, int k) {
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
	    for(int i: nums){
	        q.offer(i);
	 
	        if(q.size()>k){
	            q.poll();
	        }
	    }
	 
	    return q.peek();
	}
}
