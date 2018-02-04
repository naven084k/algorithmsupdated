package com.learn.geeks.tree;

import java.util.Arrays;

import com.learn.geeks.Utils;

public class PrintRootToLeafPath {
    public static void main(String[] args) {
    	printPath(Utils.getTree(),new int[8],0);
	}
    
    public static void printPath(Node root,int[] path,int index) {
    	if(root == null)
    		return;
    	path[index]=root.value;
    	if(root.left == null && root.right == null) {
    		System.out.println();
    		for(int i=0;i<=index;i++) {
    			System.out.print(path[i]+" ");
    		}
    	} else {
    		printPath(root.left,path,index+1);
    		printPath(root.right,path,index+1);
    	}
    		
    }
}
