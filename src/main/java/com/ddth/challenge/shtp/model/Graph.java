package com.ddth.challenge.shtp.model;

import java.util.ArrayList;

public class Graph {
	private ArrayList<String> nodes;
	private ArrayList<Edge> edges;
	
	public ArrayList<String> getNodes() {
		return nodes;
	}
	public void setNodes(ArrayList<String> nodes) {
		this.nodes = nodes;
	}
	public ArrayList<Edge> getEdges() {
		return edges;
	}
	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
}
