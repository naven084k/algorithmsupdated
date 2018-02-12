package com.learn.geeks.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.learn.geeks.Utils;

public class VerticalTraversal {

	static int min, max;
	static Map<Integer,List<Node>> map=new TreeMap<>();

	public static void main(String[] args) {
		findDistanceBoundaries(Utils.getTree(), 0);
		System.out.println(min + "," + max);
		for (int i = min; i <= max; i++) {
			printVerticalLine(Utils.getTree(), i, 0);
			System.out.println();
		}
		
		System.out.println();
		/***below O(n) solution with O(n) as memory....*/
		prepareNodeDistanceMap(Utils.getTree(),0);

		for(Map.Entry<Integer, List<Node>> entry:map.entrySet()) {
			entry.getValue().stream().forEach(node->System.out.print(node.value+" "));
			System.out.println();
		}
		
	}

	public static void findDistanceBoundaries(Node node, int boundary) {

		if (node != null) {

			if (min > boundary)
				min = boundary;
			if (max < boundary)
				max = boundary;
			findDistanceBoundaries(node.left, boundary - 1);
			findDistanceBoundaries(node.right, boundary + 1);
		}
	}

	public static void printVerticalLine(Node node, int boundary, int distance) {

		if (node != null) {

			if (boundary == distance)
				System.out.print(node.value + " ");
			printVerticalLine(node.left, boundary - 1, distance);
			printVerticalLine(node.right, boundary + 1, distance);
		}
	}
	
	public static void prepareNodeDistanceMap(Node node,int boundary) {
		
		if(node != null) {
			List<Node> list = null;
			if(map.get(boundary) != null) {
				list = map.get(boundary);
			} else {
				list = new ArrayList<>();
			}
			list.add(node);
			map.put(boundary, list);
			
			prepareNodeDistanceMap(node.left,boundary-1);
			prepareNodeDistanceMap(node.right,boundary+1);
		}
	}
}
