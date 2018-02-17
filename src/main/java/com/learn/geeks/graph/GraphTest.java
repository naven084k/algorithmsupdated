package com.learn.geeks.graph;

public class GraphTest {

	public static void main(String[] args) {
			Graph<Integer> graph = new Graph<Integer>(true);
			graph.addEdge(10, 20, 1);
			graph.addEdge(10, 40, 1);
			graph.addEdge(20, 30, 1);
			graph.addEdge(30, 50, 1);
			
			GraphTraversal<Integer> traversal=new GraphTraversal<>();
			traversal.DFS(graph);
			System.out.println("+++++++");
			traversal.BFS(graph);
	}

}
