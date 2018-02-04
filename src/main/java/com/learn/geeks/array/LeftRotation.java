package com.learn.geeks.array;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    static int[] leftRotation(int[] a, int d) {

    	for(int i=1;i<=d;i++) {
    		int pivot=a[0];
    		for(int j=1;j<a.length;j++) {
    			a[j-1]=a[j];
    		}
    		a[a.length-1]=pivot;
    	}
    	return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
