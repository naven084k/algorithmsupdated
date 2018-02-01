package com.learn.hackerrank.array;
import java.io.*;
import java.util.*;

public class DynamicArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        long lastAnswer=0;
        int seqIndex=0;
        String firstInput = scanner.nextLine();
        int numberOfSeq = Integer.parseInt(firstInput.split(" ")[0]);
        String numberOfQueries = firstInput.split(" ")[1];
        List<String> queries=new ArrayList<>();
        for(int i=0;i<Integer.parseInt(numberOfQueries);i++){
            queries.add(scanner.nextLine());
        }
        List<List<Long>> seq=new ArrayList<List<Long>>();
        for(int i=0;i<numberOfSeq;i++) {
        	seq.add(new ArrayList<>());
        }
        for(String str:queries){
            String[] query=str.split(" ");
            long x=Long.parseLong(query[1]);
            long y=Long.parseLong(query[2]);
            if(query[0].equalsIgnoreCase("1")){
                seqIndex=(int) ((x^lastAnswer)%numberOfSeq);
                seq.get(seqIndex).add(y);
            } else if(query[0].equalsIgnoreCase("2")){
                seqIndex=(int) ((x^lastAnswer)%numberOfSeq);
                int size=seq.get(seqIndex).size();
                lastAnswer=seq.get(seqIndex).get((int) (y%size));
                System.out.println(lastAnswer);
            }
        }
    }
}