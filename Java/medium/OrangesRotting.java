package medium;

import java.util.LinkedList;
import java.util.Queue;

public class OrangesRotting {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        // Step 1: Count fresh oranges & add rotten ones to queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        // If no fresh oranges, return 0
        if (fresh == 0) return 0;

        int minutes = -1;  // start from -1 because first round is minute 0
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};

        // Step 2: BFS - process level by level (minute by minute)
        while (!queue.isEmpty()) {
            int size = queue.size(); // how many rotten oranges this round
            for (int k = 0; k < size; k++) {
                int[] orange = queue.poll();
                int i = orange[0], j = orange[1];

                // spread to neighbors
                for (int[] d : directions) {
                    int ni = i + d[0], nj = j + d[1];
                    if (ni >= 0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == 1) {
                        grid[ni][nj] = 2;  // turn fresh -> rotten
                        fresh--;
                        queue.offer(new int[]{ni, nj});
                    }
                }
            }
            minutes++;
        }

        // Step 3: If fresh oranges remain, return -1
        return fresh == 0 ? minutes : -1;
    }
}
