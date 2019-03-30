package com.ddth.challenge.shtp.model;

import java.util.ArrayList;
import java.util.List;

public class AllShortestPathResponse {
	private ArrayList<List<String>> paths;

	public ArrayList<List<String>> getPaths() {
		return paths;
	}

	public void setPaths(ArrayList<List<String>> paths) {
		this.paths = paths;
	}
}
