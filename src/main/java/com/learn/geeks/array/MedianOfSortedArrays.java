package com.learn.geeks.array;

public class MedianOfSortedArrays {

	public static void main(String[] args) {
		
		int[] x = {1, 3, 8, 9, 15};
        int[] y = {7, 11, 19, 21, 18, 25};
        
        findMedian(x,y);
	}
	
	public static void findMedian(int a[],int b[]) {
		
		if(a.length > b.length) {
			findMedian(b,a);
		} else {
			
			int x = a.length;
			int y = b.length;
			
			int low = 0;
			int high = x;
			
			while(low <= high) {
				int pivotX = (low+high)/2;
				int pivotY = ((x+y+1)/2) - pivotX;
				
				int maxLeftX = pivotX == 0? Integer.MIN_VALUE:a[pivotX-1];
				int minRightX = pivotX == x? Integer.MAX_VALUE:a[pivotX];
				
				int maxLeftY = pivotY == 0? Integer.MIN_VALUE:b[pivotY-1];
				int minRightY = pivotY == y? Integer.MAX_VALUE:b[pivotY];
				
				if(maxLeftX <= minRightY && maxLeftY <= minRightX) {
					if((x+y)%2 == 0) {
						int avg = (Math.max(maxLeftX, maxLeftY)+Math.min(minRightX, minRightY))/2;
						System.out.println(avg);
					} else {
						System.out.println(Math.max(maxLeftX, maxLeftY));
					}
					return;
						
				} else if(maxLeftX > minRightY) {
					high = pivotX -1;
				} else {
					low = pivotX + 1;
				}
			}
		}
	}
}
