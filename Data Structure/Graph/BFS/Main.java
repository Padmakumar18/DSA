package DSA.Graph.BFS;

public class Main {
    public static void main(String[] args) {
        int[][] g = {
                {0,1,0,0,1},
                {1,0,1,0,1},
                {0,1,0,1,0},
                {0,0,1,0,1},
                {1,1,0,1,0}
        };

        Graph graph = new Graph(5);

        graph.addEdge(1,2);
        graph.addEdge(3,4);
        graph.addEdge(2,3);
        graph.addEdge(4,5);
        graph.addEdge(1,5);
        graph.addEdge(2,5);

        graph.print();
//        System.out.println(graph.adjList.size());
        graph.bfs(0 );
    }
}