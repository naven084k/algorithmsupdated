package com.learn.geeks.array;

import java.util.Comparator;
import java.util.TreeSet;

class Solution {
	
	public static void main(String[] args) {
		Solution sl = new Solution();
		sl.medianSlidingWindow(new int[]{2,1,6},3);
	}
    public double[] medianSlidingWindow(int[] nums, int k) 
    {
        SlidingMedian sm=new SlidingMedian(nums,k);
        int count=0;
        double[] median =new double[nums.length-k+1];
        for(int i=0;i<k;i++)
            sm.add(i);
        for(int i=k;i<nums.length;i++)
        {
            median[count++] = sm.median();
            sm.remove(i-k);
            sm.add(i);
        }
        median[count]=sm.median();
        return median;
    }
}


//
class SlidingMedian
{
    int[] nums;
    TreeSet<Integer> max_heap,min_heap;
    int max_size,min_size;
    double running_median;
    //ctor
    SlidingMedian(int[] arr,int k)
    {
        running_median=0;
        nums=arr;
				
				// Compartor to compare indices based on values in nums array
        Comparator<Integer> cmp = (a,b)->{
            return nums[a]!=nums[b]?Integer.compare(nums[a],nums[b]):a-b;
        };
            
        max_heap=new TreeSet<Integer>(cmp.reversed());
        min_heap = new TreeSet<Integer>(cmp);
        min_size=0;max_size=0;
    }
    
    //median
    public double median()
    {
        if(min_size==0 && max_size==0)
            return 0;
        else if(max_size>min_size)
            return nums[max_heap.first()];
        else if(min_size>max_size)
            return nums[min_heap.first()];
        else
            return ((double)nums[max_heap.first()]+nums[min_heap.first()])/2.0;
    }
    
    //add
   public void add(int i)
    {
        if(nums[i]<running_median) //add to max heap
        {
            if(max_size>min_size)
            {
                min_heap.add(max_heap.pollFirst());
                min_size++;
                max_size--;
            }
            max_heap.add(i);
            max_size++;
        }
        else
        {
             if(min_size>max_size)
            {
                max_heap.add(min_heap.pollFirst());
                max_size++;
                min_size--;
            }
            min_heap.add(i);
            min_size++;
        }
        
        running_median = median();
    }
    
    //remove
    public void remove(int i)
    {
      /*  System.out.println("median before removing "+running_median+" min_heap "+min_heap+" max_heap "+max_heap+" max_size "+max_size+" min_size= "+min_size); */
        if(!min_heap.remove(i)) //element not present in min_heap
        {
            max_heap.remove(i);
            max_size--;
        }
        else
            min_size--;
        
        //balancing heaps
        if(min_size-max_size>1)
        {
                max_heap.add(min_heap.pollFirst());
                max_size++;
                min_size--;
        }
        else if(max_size-min_size>1)
            {
                min_heap.add(max_heap.pollFirst());
                min_size++;
                max_size--;
            }
        
        running_median=median();
   //     System.out.println("median= "+running_median+"no removed "+nums[i]+"min_heap "+min_heap+"max_heap "+max_heap);
    }
}
