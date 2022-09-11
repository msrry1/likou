package com.algorithm.likou.p601_p700;

/**
 * @ClassName:p695_岛屿的最大面积
 * @Auther: Lyh
 * @Date: 2022/7/3 11:27
 * @Version: v1.0
 */
public class p695_岛屿的最大面积 {
    int ret = 0;
    boolean[][] flag;
    public int dfs(int[][] grid, int i,int j){

        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length){
            return 0;
        }
        if(grid[i][j] == 0 || flag[i][j] == true){
            return 0;
        }
        flag[i][j] = true;
        int size = 1;

        size += dfs(grid,i-1,j);
        size += dfs(grid,i+1,j);
        size += dfs(grid,i,j-1);
        size += dfs(grid,i,j+1);
        return size;
    }
    public int maxAreaOfIsland(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        flag = new boolean[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(grid[i][j] == 1){
                    int size = dfs(grid, i, j);
                    ret = Math.max(ret, size);
                }
            }
        }
        return ret;
    }
}
