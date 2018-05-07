package com.learn.work.test;
import java.util.*;
 
class GFG {
     
    static int findWater(int arr[], int n)
    {
        // initialize output
        int result = 0;
          
        // maximum element on left and right
        int left_max = 0, right_max = 0;
          
        int lo = 0, hi = n-1;
          
        while(lo <= hi) 
        {
            if(arr[lo] < arr[hi])
            {
                if(arr[lo] > left_max)
                left_max = arr[lo];
                else
                result += left_max - arr[lo];
                lo++;
            }
            else
            {
                if(arr[hi] > right_max)
                right_max = arr[hi];
                else
                result += right_max - arr[hi];
                hi--;
            }
        }
          
        return result;
    }
     
    /* Driver program to test above function */
    public static void main(String[] args) 
    {
        int arr[] = {3,0,4,0,1};
        int n = arr.length;
         
        System.out.println("Maximum water that "
                       + "can be accumulated is "
                       + findWater(arr, n));
         
    }
}