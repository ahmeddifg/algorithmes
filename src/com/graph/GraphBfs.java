package com.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// O(V+E)

public class GraphBfs {
    private int V;   // No. of vertices

    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    GraphBfs(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);  // Add w to v's list.
    }

    void bfs(int start) {
        Queue<Integer> queue = new LinkedList<Integer>();
        boolean visited[] = new boolean[V];
        queue.add(start);

        visited[start] = true;
        queue.add(start);
        int item = 0;
        while (queue.size() != 0) {
            item = queue.poll();
            System.out.print(item + " ");
            Iterator<Integer> ite = adj[item].iterator();
            while (ite.hasNext()) {
                item = ite.next();
                if (!visited[item]) {
                    queue.add(item);
                    visited[item] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBfs g = new GraphBfs(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.bfs(2);
    }
}
