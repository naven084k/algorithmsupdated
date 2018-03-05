package com.learn.geeks.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ConstructBinaryTreeFromAncestorMatrix {

	public static void main(String[] args) {

		int[][] mat = {{ 0, 0, 0, 0, 0, 0 },
		        { 1, 0, 0, 0, 1, 0 },
		        { 0, 0, 0, 1, 0, 0 },
		        { 0, 0, 0, 0, 0, 0 },
		        { 0, 0, 0, 0, 0, 0 },
		        { 1, 1, 1, 1, 1, 0 }
		    };
		TreeTraversals.inorder(constructTree(mat));
	}
	
	public static Node constructTree(int[][] arr) {
		boolean parent[] = new boolean[6];
		Map<Integer,List<Integer>> map = new TreeMap<>();
		
		for(int i=0;i<arr.length;i++) {
			Integer sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum += arr[i][j];
			}
			if(map.get(sum) == null) {
				map.put(sum, new ArrayList<>());
			}
			List<Integer> list = map.get(sum);
			list.add(i);
		}
		
		Node[] nodes=new Node[6];
		Node temp=null;
		for(Map.Entry<Integer, List<Integer>> entry:map.entrySet()) {
			for(Integer x:entry.getValue()){
				
				nodes[x]=new Node(x);
				temp = nodes[x];
				
				for(int k=0;k<arr[x].length;k++) {
					if(!parent[k] && arr[x][k] == 1) {
						if(temp.left == null) {
							temp.left = nodes[k];
						} else
							temp.right = nodes[k];
						
						parent[k] = true;
					}
				}
			}
			
		}
		return temp;
	}

}
