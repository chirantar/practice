package org.example.dsa.graph.dfs;

import java.util.ArrayList;
import java.util.List;

class Graph{
    int v;
    List<List<Integer>> adj;
    public Graph(int v){
        this.v = v;
        this.adj = new ArrayList<>();
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }
    }

    void addEdge(int v, int u){
        adj.get(v).add(u);
        adj.get(u).add(v);
    }

    void dfs(int s){
        boolean[] vis = new boolean[v];
        dfsUtil(s, adj, vis);
    }

    private void dfsUtil(int s, List<List<Integer>> adj, boolean[] vis) {
        vis[s] = true;
        System.out.println(s);
        List<Integer> list = adj.get(s);
        for(int node: list){
            if(!vis[node]){
                dfsUtil(node, adj, vis);
            }
        }
    }
}
public class DFSTraversal {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.dfs(0);
    }
}
