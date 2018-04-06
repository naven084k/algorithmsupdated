package com.learn.geeks.array;

public class MedianOfSortedArrays {

	public static void main(String[] args) {
		
		int[] x = {1, 3, 8, 9, 15};
        int[] y = {7, 11, 19, 21, 18, 25};
        
        findMedian(x,y);
        findMedianSortedArrays(x,y);
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
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	    int total = nums1.length+nums2.length;
	    if(total%2==0){
	        return (findKth(total/2+1, nums1, nums2, 0, 0)+findKth(total/2, nums1, nums2, 0, 0))/2.0;
	    }else{
	        return findKth(total/2+1, nums1, nums2, 0, 0);
	    }
	}
	 
	public static int findKth(int k, int[] nums1, int[] nums2, int s1, int s2){
	    if(s1>=nums1.length)
	        return nums2[s2+k-1];
	 
	    if(s2>=nums2.length)
	        return nums1[s1+k-1];
	 
	    if(k==1)
	        return Math.min(nums1[s1], nums2[s2]);
	 
	    int m1 = s1+k/2-1;
	    int m2 = s2+k/2-1;
	 
	    int mid1 = m1<nums1.length?nums1[m1]:Integer.MAX_VALUE;    
	    int mid2 = m2<nums2.length?nums2[m2]:Integer.MAX_VALUE;
	 
	    if(mid1<mid2){
	        return findKth(k-k/2, nums1, nums2, m1+1, s2);
	    }else{
	        return findKth(k-k/2, nums1, nums2, s1, m2+1);
	    }
	}
}
