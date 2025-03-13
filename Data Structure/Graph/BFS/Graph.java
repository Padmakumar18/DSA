package DSA.Graph.BFS;

import java.util.*;

public class Graph
{
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
    Graph(int v)
    {
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<Integer>());
        }
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

    public void bfs(int v)
    {
        int V = adjList.size();
        boolean[] visited = new boolean[V];

        visited[v] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(v);

        while(q.size()!=0)
        {
            int vertex = q.remove();
            System.out.println(vertex);
            for (int i = 0; i < adjList.get(vertex).size(); i++)
            {
                int av = adjList.get(vertex).get(i);
                if(!visited[av])
                {
                    q.add(av);
                    visited[av] = true;
                }
            }
        }
    }
}