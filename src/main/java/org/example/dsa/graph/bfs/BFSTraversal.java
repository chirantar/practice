package org.example.dsa.graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


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

    void bfs(int s){
        boolean[] vis = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(s);

        vis[s] = true;

        while(!q.isEmpty()){
            int node = q.poll();
            System.out.println(node);
            List<Integer> list = adj.get(node);
            for(int item: list){
                if (!vis[item]){
                    q.add(item);
                    vis[item] = true;
                }
            }
        }
    }


}
public class BFSTraversal {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        g.bfs(0);
    }
}
