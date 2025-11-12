package graph;
import java.util.ArrayList;
public class TestGraph {


    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
            adj.get(0).add(1); adj.get(1).add(0);
            adj.get(0).add(2); adj.get(2).add(0);
            adj.get(1).add(3); adj.get(3).add(1);
            adj.get(2).add(3); adj.get(3).add(2);
            boolean[] visited = new boolean[n];
            System.out.print("DFS Traversal: ");
            dfs(0, visited, adj);
        }

}
