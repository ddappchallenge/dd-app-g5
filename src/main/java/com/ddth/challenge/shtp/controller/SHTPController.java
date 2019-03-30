package com.ddth.challenge.shtp.controller;

import com.ddth.challenge.shtp.algorithm.ShortestPath;
import com.ddth.challenge.shtp.model.AllShortestPathResponse;
import com.ddth.challenge.shtp.model.BFS;
import com.ddth.challenge.shtp.model.Edge;
import com.ddth.challenge.shtp.model.Graph;
import com.ddth.challenge.shtp.model.Path;
import com.ddth.challenge.shtp.model.ResponseMessage;
import com.ddth.challenge.shtp.model.SearchTree;
import com.ddth.challenge.shtp.model.ShortestPathResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.lang.*; 
import java.io.*; 

@RestController
public class SHTPController {

	public static String lastestMessage = "Hello World";

	@PostMapping(value="/graph")
	@ResponseStatus(HttpStatus.OK)
	public void createGraph(@RequestBody Graph req) throws Exception{	

	}
	
	@GetMapping(value="/graph/shortestPath")
	public ShortestPathResponse getShortestPath(@RequestParam(value="src") String src, @RequestParam(value="dest") String dest) throws Exception{           
 
    // A utility function to find the vertex with minimum distance value, 
    // from the set of vertices not yet included in shortest path tree
    public static int V=5; 
    int minDistance(int dist[], Boolean sptSet[]) 
    { 
        // Initialize min value 
        int min = Integer.MAX_VALUE, min_index=-1; 
  
        for (int v = 0; v < V; v++) 
            if (sptSet[v] == false && dist[v] <= min) 
            { 
                min = dist[v]; 
                min_index = v; 
            } 
  
        return min_index; 
    }     
            void printSolution(int dist[], int n) 
    { 
        System.out.println("Vertex   Distance from Source"); 
        for (int i = 0; i < V; i++) 
            System.out.println(i+" tt "+dist[i]); 
    } 
             void dijkstra(int graph[][], int src) 
    { 
        int dist[] = new int[V]; // The output array. dist[i] will hold 
                                 // the shortest distance from src to i 
  
        // sptSet[i] will true if vertex i is included in shortest 
        // path tree or shortest distance from src to i is finalized 
        Boolean sptSet[] = new Boolean[V]; 
  
        // Initialize all distances as INFINITE and stpSet[] as false 
        for (int i = 0; i < V; i++) 
        { 
            dist[i] = Integer.MAX_VALUE; 
            sptSet[i] = false; 
        } 
  
        // Distance of source vertex from itself is always 0 
        dist[src] = 0; 
  
        // Find shortest path for all vertices 
        for (int count = 0; count < V-1; count++) 
        { 
            // Pick the minimum distance vertex from the set of vertices 
            // not yet processed. u is always equal to src in first 
            // iteration. 
            int u = minDistance(dist, sptSet); 
  
            // Mark the picked vertex as processed 
            sptSet[u] = true; 
  
            // Update dist value of the adjacent vertices of the 
            // picked vertex. 
            for (int v = 0; v < V; v++) 
  
                // Update dist[v] only if is not in sptSet, there is an 
                // edge from u to v, and total weight of path from src to 
                // v through u is smaller than current value of dist[v] 
                if (!sptSet[v] && graph[u][v]!=0 && 
                        dist[u] != Integer.MAX_VALUE && 
                        dist[u]+graph[u][v] < dist[v]) 
                    dist[v] = dist[u] + graph[u][v]; 
        } 
  
        // print the constructed distance array 
        printSolution(dist, V); 
    }
             // Driver method 
    public static void main (String[] args) 
    { 
        /* Let us create the example graph discussed above */
       int graph[][] = new int[][]{{0, 10, 10, 0, 0}, 
                                  {0, 0, 5, 0, 15}, 
                                  {0, 0, 0, 0, 0}, 
                                  {0, 0, 0, 0, 0}, 
                                  {0, 0, 0, 0, 0} 
                                 }; 
        ShortestPath t = new ShortestPath(); 
        t.dijkstra(graph, 0); 
    } 
} 

	
	@GetMapping(value="/graph/allShortestPath")
	public AllShortestPathResponse getAllShortestPath(@RequestParam(value="src") String src, @RequestParam(value="dest") String dest) throws Exception{
		return null;
	} 
}
