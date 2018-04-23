package com.learn.work.test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tester1 {
	
	static void insertionSort(int arr[],int aux[], int n)
	{
	    for (int i = 1; i < n; i++)
	    {
	        int key1 = aux[i];
	        int key2 = arr[i];
	        int j = i-1;
	 
	        while (j >= 0 && aux[j] < key1)
	        {
	            aux[j+1] = aux[j];
	            arr[j+1] = arr[j];
	            j = j-1;
	        }
	        aux[j+1] = key1;
	        arr[j+1] = key2;
	    }
	}
	 
	
    static int[] rearrange(int[] elements) {
    	
    	if(elements == null || elements.length == 0)
        	return elements;
    	
    	int aux[] = new int[elements.length];
 	    for (int i=0; i<elements.length; i++)
 	        aux[i] = Integer.bitCount(elements[i]);
 	 
 	   for (int i = 1; i < elements.length; i++)
	    {
	        int key1 = aux[i];
	        int key2 = elements[i];
	        int j = i-1;
	 
	        while (j >= 0 && (aux[j] > key1 || (aux[j] ==  key1 && elements[j] > elements[i])))
	        {
	        		 aux[j+1] = aux[j];
	 	            elements[j+1] = elements[j];
	 	            j = j-1;
	        }
	        aux[j+1] = key1;
	        elements[j+1] = key2;
	    }
 	    
 	    return elements;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = 0;
        n = Integer.parseInt(in.nextLine().trim());
        int[] elements = new int[n];
        int element;
        for (int i = 0; i < n; i++) {
            element = Integer.parseInt(in.nextLine().trim());
            elements[i] = element;
        }
        
        // call rearrange function
        int[] results = rearrange(elements);
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(String.valueOf(results[i]));
        }
    }
}