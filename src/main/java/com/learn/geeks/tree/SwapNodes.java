package com.learn.geeks.tree;
import java.io.*;
import java.util.*;

public class SwapNodes {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        int N = Integer.parseInt(scanner.nextLine());
        String[] str=null;
        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(1);
        queue.add(root);
        Node temp=null;

        for(int i=0;i<N;i++){
            str = scanner.nextLine().split(" ");
            temp = queue.poll();
            
            int left = Integer.parseInt(str[0]);
            if(left != -1) {
            	temp.left = new Node(left);
                queue.add(temp.left);
            }
            int right=Integer.parseInt(str[1]);
            if(right != -1) {
            	temp.right = new Node(right);
                queue.add(temp.right);
            }
            
        }
        int T = Integer.parseInt(scanner.nextLine());
        for(int i=0;i<T;i++){
        	swapAtDepth(root,1,scanner.nextInt());
        	inorder(root);
        	System.out.println();
        }
        scanner.close();
    }
    
    static void inorder(Node root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.value+" ");
            inorder(root.right);
        }
       }
    static void swap(Node a) {
    	Node temp = a.left;
    	a.left = a.right;
    	a.right = temp;
    }
    
    static void swapAtDepth(Node root,int currHeight,int atDepth) {
    	
    	if(root != null) {
    		if(currHeight % atDepth == 0) {
        		swap(root);
        	}
        	swapAtDepth(root.left,currHeight+1,atDepth);
        	swapAtDepth(root.right,currHeight+1,atDepth);
    	}
    }
}