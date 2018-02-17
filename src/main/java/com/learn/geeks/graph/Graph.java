package com.learn.geeks.graph;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Graph<T> {
    Set<Vertex<T>> vertices;
    Set<Edge<T>> edges;
    boolean directedGraph;
    
    public Graph(boolean directedGraph){
    	vertices = new LinkedHashSet<>();
    	edges = new LinkedHashSet<>();
    	this.directedGraph=directedGraph;
    }
	
    public void addVertex(Vertex<T> vertex) {
    	if(vertices.contains(vertex))
    		return;
    	  
    	vertices.add(vertex);
    	
    	for(Edge<T> edge:vertex.edges) {
    		edges.add(edge);
    	}
    	
    }
    
    public void addEdge(T a,T b,int weight) {
    	
    	Optional<Vertex<T>> v1Opt= vertices.stream().filter(p->p.data.equals(a)).findFirst();
    	Vertex<T> v1=null;
    	if(v1Opt.isPresent()) {
    		v1 = v1Opt.get();
    	} else {
    		v1 = new Vertex<T>(a);
    		vertices.add(v1);
    	}
    	v1Opt= vertices.stream().filter(p->p.data.equals(b)).findFirst();
    	Vertex<T> v2=null;
    	if(v1Opt.isPresent()) {
    		v2 = v1Opt.get();
    	}else {
    		v2 = new Vertex<T>(b);
    		vertices.add(v2);
    	}
    	
    	Edge<T> edge = new Edge<T>(v1,v2,weight);
    	v1.edges.add(edge);
    	v1.neighbours.add(v2);
    	if(!directedGraph) {
    		v2.edges.add(edge);
    		v2.neighbours.add(v1);
    	}
    }
}

class Vertex<T> {
	T data;
	Set<Edge<T>> edges;
	Set<Vertex<T>> neighbours;
	public Vertex(T data) {
		this.data = data;
		this.edges = new HashSet<>(); 
		this.neighbours = new HashSet<>();
	}

	@Override
	public int hashCode() {
		return data.hashCode();
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex<T> other = (Vertex<T>) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		return true;
	}
	
	
	
}

class Edge<T> {
	Vertex<T> v1;
	Vertex<T> v2;
	int weight;
	
	public Edge(Vertex<T> v1, Vertex<T> v2,int weight) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.weight=weight;
	}

	@Override
	public int hashCode() {
		return v1.hashCode()+v2.hashCode();
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		 Edge<T> e = (Edge<T>)obj;
         return e.v1.equals(this.v1) && e.v2.equals(this.v2);

	}
	
	
}
