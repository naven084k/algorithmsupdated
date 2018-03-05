package com.learn.geeks.array;

public class PrintMatrixDiagnally {

	public static void main(String[] args) {
		
		  int arr[][] = { 
				  {1,   2,  3,   4},
                  {5,   6,  7,   8},
                  {9,  10,  11, 12},
                  {13, 14,  15, 16},
                  {17, 18,  19, 20}, };
		  
		  for(int i=0;i<arr.length;i++) {
			  
			  int j=0;
			  int k=i;
			  while(k >= 0 && j < arr[i].length) {
				  System.out.print(arr[k][j]+" "); 
				  k--;
				  j++;
			  }
			  System.out.println();
		  }
		  
		  for(int i=1;i<arr[0].length;i++) {
			  
			  int j=i;
			  int k=arr.length-1;
			  while(k >= 0 && j < arr[0].length) {
				  System.out.print(arr[k][j]+" "); 
				  k--;
				  j++;
			  }
			  System.out.println();
		  }
	}
}
