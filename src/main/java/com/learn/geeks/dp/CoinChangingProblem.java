package com.learn.geeks.dp;

public class CoinChangingProblem {

	public static void main(String[] args) {
		
		 int total = 13;
	     int coins[] = {7, 3, 2, 6};
	     int target[] = new int[total+1];
	     int parent[] = new int[total+1];
	     target[0]=0;
	     for(int i=1;i<=total;i++) {
	    	 target[i] = Integer.MAX_VALUE-1;
	    	 parent[i] = -1;
	     }
	     
	     for(int j=0;j<coins.length;j++) {
	    	 for(int i=1;i<=total;i++) {
		    	 
	    		 if(i >= coins[j]) {
	    			 if(1+target[i - coins[j]] < target[i]) {
	    				 target[i] = 1+target[i - coins[j]];
   					  parent[i]=j;	 
	    			 }
	    		 }
		     }
	     }
	     System.out.println("no of coins required are "+target[total]);
	     
	     if(parent[total] == -1)
	    	 System.out.println("no solution found");
	     else {
	    	 int start = total;
	    	 while(start != 0) {
	    		 System.out.print(coins[parent[start]]+" ");start=start-coins[parent[start]];
	    	 }
	     }
	}
}
