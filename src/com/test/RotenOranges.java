package com.test;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class RotenOranges {

	  int[] dr = new int[] { -1, 0, 1, 0 };
	  int[] dc = new int[] { 0, -1, 0, 1 };

	  public int orangesRotting(int[][] grid) {
	    int R = grid.length, C = grid[0].length;

	    // queue : all starting cells with rotten oranges
	    Queue<Integer> queue = new ArrayDeque();
	    Map<Integer, Integer> depth = new HashMap();
	    for (int r = 0; r < R; ++r)
	      for (int c = 0; c < C; ++c)
	        if (grid[r][c] == 2) {
	          int code = r * C + c;
	          queue.add(code);
	          depth.put(code, 0);
	        }

	    int ans = 0;
	    while (!queue.isEmpty()) {
	      int code = queue.remove();
	      int r = code / C, c = code % C;
	      for (int k = 0; k < 4; ++k) {
	        int nr = r + dr[k];
	        int nc = c + dc[k];
	        if (0 <= nr && nr < R && 0 <= nc && nc < C && grid[nr][nc] == 1) {
	          grid[nr][nc] = 2;
	          int ncode = nr * C + nc;
	          queue.add(ncode);
	          depth.put(ncode, depth.get(code) + 1);
	          ans = depth.get(ncode);
	        }
	      }
	    }

	    for (int[] row : grid)
	      for (int v : row)
	        if (v == 1)
	          return -1;
	    return ans;


	    //OTHER Solution
	    
	  //bfs, 1 find all rotten == 2
        //put 2 into a queue
        //each time poll 2 then go four directions, if next is 1, change to 2, put back to queue
        //if queue is empty, check if there is still 1
        
//        Queue<int[]> qu = new LinkedList<>();
//        
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (grid[i][j] == 2) {
//                    qu.offer(new int[]{i, j});
//                }
//            }
//        }
//        
//        int[][] direction = {{1,0}, {0,1}, {0,-1}, {-1, 0}};
//        
//        int level = 0;
//        while (!qu.isEmpty()) {
//            level++;
//            int size = qu.size();
//            for (int i = 0; i < size; i++) {
//                int[] rotten = qu.poll();
//                for (int[] dir : direction) {
//                    int nx = dir[0] + rotten[0];
//                    int ny = dir[1] + rotten[1];
//                    
//                    if (nx < 0 || ny < 0 || nx >= grid.length || ny >= grid[0].length || grid[nx][ny] != 1)
//                        continue;
//                    
//                    grid[nx][ny] = 2;
//                    qu.offer(new int[]{nx, ny});
//                }        
//            }
//        }
//        
//        for (int[] x : grid) {
//            for (int y : x) {
//                if (y == 1)
//                    return -1;
//            }
//        }
//
//        return level == 0 ? 0 : level - 1;
	  }

}
