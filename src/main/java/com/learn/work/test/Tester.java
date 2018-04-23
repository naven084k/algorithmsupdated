package com.learn.work.test;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Tester {
	
    static boolean[] twins(String[] a, String[] b) {
        boolean[] result = new boolean[a.length];
        result[0] = permutedStringCount(a) == 1;
        result[0] = permutedStringCount(b) == 1;
        return result;
    }
    
    static String prepareString(String str)
    {
        int hashEven[] = new int[26];
        int hashOdd[] = new int[26];
     
        for (int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if (i%2 == 1) 
               hashOdd[c-'a']++;
            else
               hashEven[c-'a']++;
        }
     
        StringBuilder encoding = new StringBuilder();;
        for (int i=0; i<26; i++)
        {
           encoding.append(hashEven[i]+"-");
           encoding.append(hashOdd[i]+"-");
        }
        return encoding.toString();
    }
     
    static int permutedStringCount(String input[])
    {
        int countDist = 0;  
        int n=input.length;
        Set<String> s=new HashSet<>();;
        for (int i=0; i<n; i++)
        {
           if (!s.contains(prepareString(input[i])))
           {
               s.add(prepareString(input[i]));
               countDist++;
           }
        }
        return countDist;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = Integer.parseInt(in.nextLine().trim());
        String[] a = new String[n];
        for(int i = 0; i < n; i++) {
            a[i] = in.nextLine();
        }
        
        int m = Integer.parseInt(in.nextLine().trim());
        String[] b = new String[m];
        for(int i = 0; i < m; i++) {
            b[i] = in.nextLine();
        }
        
        // call twins function
        boolean[] results = twins(a, b);
        
        for(int i = 0; i < results.length; i++) {
            System.out.println(results[i]? "Yes" : "No");
        }
    }
}