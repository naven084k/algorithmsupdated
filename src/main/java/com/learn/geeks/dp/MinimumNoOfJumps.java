package com.learn.geeks.dp;

public class MinimumNoOfJumps {

	public static void main(String[] args) {
		int arr[] = {3,3,1,2,14,2,1,1,1,1};
		System.out.println(minJumpsNaiveAproach(arr,0));
		System.out.println(jump(arr));
	}
	public static int minJumpsNaiveAproach(int arr[],int start) {
		if(start+arr[start] >= arr.length-1)
			return 1;
		else {
			int steps = Integer.MAX_VALUE;
			for(int i=start+1;i<=start+arr[start];i++) {
				steps = Math.min(steps,1+minJumpsNaiveAproach(arr, i));
			}
			return steps;
		}
	} 	 
	
	 public static int jump(int[] A) {
	        if (A.length <= 1)
	            return 0;
	        int maxReach = A[0];
	        int step = A[0];
	        int jump = 1;
	        for (int i = 1; i < A.length; i++) {
	           if (i == A.length - 1)
	                return jump;
	            if (i + A[i] > maxReach)
	                maxReach = i + A[i];
	            step--;
	            if (step == 0) {
	                jump++;
	                step = maxReach - i;
	            } 
	        }
	        return jump;
	    }
}
