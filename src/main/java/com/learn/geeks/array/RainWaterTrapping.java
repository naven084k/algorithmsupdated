package com.learn.geeks.array;

public class RainWaterTrapping {

	public static void main(String[] args) {
		int a[] = {3, 0, 0, 2, 0, 4};
		
		int l = 0; int r = a.length-1;
		int leftmax = 0;
		int rightmax = 0;
		int result=0;
		while(l<r) {
			
			if(a[l] < a[r]) {
				
				if(a[l] > leftmax )
				   leftmax = a[l];
				else 
					result = result +(leftmax-a[l]);
				
				l++;
			} else {
				if(a[r] > rightmax )
					rightmax = a[r];
					else 
						result = result +(rightmax-a[r]);
				
				r--;
			}
		}
		
		System.out.println(result);

	}

}
