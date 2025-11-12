
package Graph;
import java.util.*;
public class BFS {

    public static void bfs(int start, ArrayList<ArrayList<Integer>> adj, int n) {
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");
            for (int neighbor : adj.get(node)) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        q.add(neighbor);
                    }
                }
        }
    }
}
