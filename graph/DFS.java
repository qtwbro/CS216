package graph;
import java.util.*;

class DFS {
    static void dfs(int node, boolean[] visited,
        ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited, adj);
            }
        }
    }
}
