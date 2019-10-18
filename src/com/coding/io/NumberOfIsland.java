package com.coding.io;

public class NumberOfIsland {

    public static int numIslands(int[][] grid) {
        int max_count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
               if (grid[i][j] == 1) {
                   max_count++;
                   spread(i, j, grid);
               }
            }
        }
        return max_count;
    }

    public static void spread(int i,int j,int[][]grid){

       if (i<0 || i >= grid.length || j<0 || j>= grid.length || grid[i][j]==0)
            return;

       grid[i][j]=0;

        spread(i-1, j, grid);
        spread(i+1,j,grid);
        spread(i, j-1, grid);
        spread(i, j+1, grid);
    }

    public static void main(String[] args) {
        int M[][] =new int[][]  {
                                 { 1, 1, 0, 0, 0 },
                                 { 0, 1, 0, 0, 1 },
                                 { 0, 0, 0, 1, 1 },
                                 { 0, 0, 0, 0, 0 },
                                 { 1, 0, 1, 0, 1 }
                                };
        System.out.println(numIslands(M));

    }
}


/*
LeetCode
# 200. Number of Islands
Given a 2d grid map of '1's (land) and '0's (water), count the number of islands.
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
You may assume all four edges of the grid are all surrounded by water.
*/