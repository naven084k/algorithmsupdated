package com.learn.geeks.array;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumAverageSubArrayLengthK {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int T=Integer.parseInt(scanner.nextLine());

        int[] len = new int[T];
        int[][] data = new int[T][20];
        
        for(int i=0;i<T;i++){
            len[i] = Integer.parseInt(scanner.nextLine());
            String[] str=scanner.nextLine().split(" ");
            data[i] = Arrays.stream(str).map(String::trim).mapToInt(Integer::parseInt).toArray();
            
        }
        for(int input=0;input<T;input++){
            int[] arr = data[input];
            int k=len[input];
            
            int maxsum = 0;
	    for(int i=0;i<k;i++) {
	    	maxsum = maxsum+arr[i];
	    }
	    int startIndex=0;
	    int temp = maxsum;
	    for(int i=k;i<arr.length;i++) {
	    	temp = temp-arr[i-k]+arr[i];
	    	if(temp > maxsum) {
	    		maxsum = temp;
	    		startIndex = i-k+1;
	    	} 
	    }
	    for(int i=startIndex;i<startIndex+k;i++) {
	    	System.out.print(arr[i]+" ");
	    }
	    System.out.println();
            
        }
	}
}