package com.learn.geeks.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class QueueUsing2Stacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int queries = Integer.parseInt(scanner.nextLine());
        List<String> queryList = new ArrayList<>();
        
        for(int i=0;i<queries;i++){
            queryList.add(scanner.nextLine());
        }
        
        Stack<String> in = new Stack<>();
        Stack<String> out = new Stack<>();
        
        for(String input:queryList){
            String[] data=input.split(" ");
            if(data[0].equalsIgnoreCase("1")){
                in.push(data[1]);
            } else {
                if(out.isEmpty()){
                   while(!in.isEmpty()){
                       out.push(in.pop());
                   } 
                }
                if(data[0].equalsIgnoreCase("2"))
                out.pop();
                if(data[0].equalsIgnoreCase("3"))
                    System.out.println(out.peek());
            } 
                
        }
    }
}
