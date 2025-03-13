package DSA.Graph.DFS;

import java.util.*;

public class Graph
{
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    boolean[] visited ;
    Graph(int v)
    {
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        visited = new boolean[v];
    }

    public void addEdge(int u,int v)
    {
        adjList.get(u-1).add(v-1);
        adjList.get(v-1).add(u);
    }

    public void print()
    {
        for (int i = 0; i < adjList.size(); i++)
        {
            System.out.println(adjList.get(i));
        }
    }

    public void dfs(int v)
    {
        visited[v] = true;
        System.out.println(v);
        for (int i = 0; i < adjList.get(v).size(); i++) {
            int av = adjList.get(v).get(i);
            if(!visited[av])
            {
                dfs(av);
            }
        }
    }
}