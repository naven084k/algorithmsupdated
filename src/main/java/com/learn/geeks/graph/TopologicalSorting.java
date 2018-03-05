package com.learn.geeks.graph;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class TopologicalSorting {

	public static void main(String[] args) {
		Graph<String> graph = new Graph<String>(true);
		graph.addEdge("A", "C", 1);
		graph.addEdge("B", "C", 1);
		graph.addEdge("B", "D", 1);
		graph.addEdge("C","E",1);
		graph.addEdge("E","F",1);
		graph.addEdge("D","F",1);
		graph.addEdge("F","G",1);
		
		topologicalSort(graph);
	}

	public static void topologicalSort(Graph<String> graph) {
		Set<Vertex<String>> visited = new HashSet<>();
		Stack<Vertex<String>> stack = new Stack<>();
		
		for(Vertex<String> v:graph.vertices) {
			if(visited.contains(v))
				continue;
			visiteChildren(v,visited,stack);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().data+" ");
		}
	}
	public static void visiteChildren(Vertex<String> v, Set<Vertex<String>> visited,Stack<Vertex<String>> stack) {
		if(visited.contains(v))
			return;
		visited.add(v);
		
		for(Vertex<String> u:v.neighbours) {
			if(visited.contains(u))
				continue;
			visiteChildren(u,visited,stack);
		}
		stack.push(v);
	}
}
