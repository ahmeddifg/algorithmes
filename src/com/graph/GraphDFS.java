package com.graph;

import java.util.Iterator;
import java.util.LinkedList;

// O(V+E)
public class GraphDFS {

    private int V;   // No. of vertices

    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    GraphDFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
        // Add w to v's list.
    }

    void dfs(int v) {
        boolean[] visited = new boolean[this.V];
        dfsUtil(v, visited);
    }

    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        Iterator<Integer> ite = adj[v].iterator();
        Integer item = null;
        while (ite.hasNext()) {
            item = ite.next();
            if (!visited[item])
                dfsUtil(item, visited);
        }

    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.dfs(2);
    }
}
