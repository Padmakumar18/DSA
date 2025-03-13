import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

    Graph(int val) {
        for(int i=0;i<val;i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u,int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void printAdjList() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.println(" Ajd list of vertex " + i);
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(" "+adjList.get(i).get(j));
            }
            System.out.println();
        }
    }
}
