package com.learn.geeks.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class GraphTraversal<T> {

	public void DFS(Graph<T> graph) {
		Set<Vertex<T>> visited = new HashSet<>();
		for(Vertex<T> vertex:graph.vertices) {
			if(!visited.contains(vertex)) {
				DFS(vertex,visited);
			}
		}
	}
	
	public void DFS(Vertex<T> vertex,Set<Vertex<T>> visited) {
		if(visited.contains(vertex))
			return;
			
		visited.add(vertex);
		System.out.print(vertex.data+" =>");
		for(Vertex<T> v:vertex.neighbours) {
			DFS(v,visited);
		}
	}
	
	public void BFS(Graph<T> graph) {
		Set<Vertex<T>> visited = new HashSet<>();
		Queue<Vertex<T>> queue = new LinkedList<>();
		
		for(Vertex<T> vertex:graph.vertices) {
			if(!visited.contains(vertex)) {
				queue.add(vertex);
				System.out.println();
				while(!queue.isEmpty()) {
					Vertex<T> v=queue.poll();
					if(!visited.contains(v)) {
						visited.add(v);
						System.out.print(v.data+" => ");
						queue.addAll(v.neighbours);
					}
				}
			}
		}
	}
}
