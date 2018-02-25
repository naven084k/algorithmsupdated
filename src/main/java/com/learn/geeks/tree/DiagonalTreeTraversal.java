package com.learn.geeks.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.learn.geeks.Utils;

public class DiagonalTreeTraversal {

	static Map<Integer,List<Node>> map = new HashMap<>();
	public static void main(String[] args) {

		printDigonalTree(Utils.getTree(),0);
		for(Map.Entry<Integer, List<Node>> entry:map.entrySet()) {
			entry.getValue().forEach(element->{System.out.print(element.value+" ");});
			System.out.println();
		}
	}
	
	public static void printDigonalTree(Node node,int d) {
		if(node != null)
		{
			if(map.get(d) == null) {
				map.put(d, new ArrayList<>());
			}
			map.get(d).add(node);
			printDigonalTree(node.left,d-1);
			printDigonalTree(node.right,d);
		}
	}

}
