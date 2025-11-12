package Graph;

import java.util.ArrayList;
public class TestGraph {


    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<Integer>> dfs = new ArrayList<>();
        for (int i = 0; i < n; i++) dfs.add(new ArrayList<>());
        dfs.get(0).add(1); dfs.get(1).add(0);
        dfs.get(0).add(2); dfs.get(2).add(0);
        dfs.get(1).add(3); dfs.get(3).add(1);
        dfs.get(2).add(3); dfs.get(3).add(2);
        boolean[] visited = new boolean[n];
        System.out.print("\nDFS Traversal: ");
        DFS.dfs(0, visited, dfs);

        ArrayList<ArrayList<Integer>> bfs = new ArrayList<>();
        for (int i = 0; i < n; i++) bfs.add(new ArrayList<>());
        bfs.get(0).add(1); bfs.get(1).add(0);
        bfs.get(0).add(2); bfs.get(2).add(0);
        bfs.get(1).add(3); bfs.get(3).add(1);
        bfs.get(2).add(3); bfs.get(3).add(2);
        System.out.print("\nBFS Traversal: ");
        BFS.bfs(0, bfs, n);
        }

}
