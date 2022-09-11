package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p200_岛屿数量
 * @Auther: Lyh
 * @Date: 2022/7/16 14:56
 * @Version: v1.0
 */
public class p200_岛屿数量 {public int numIslands(char[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int ret = 0;
    for(int i = 0;i < m;i++){
        for(int j = 0;j < n;j++){
            if(grid[i][j] == '1'){
                dfs(grid, i, j, m, n);
                ret++;
            }
        }
    }
    return ret;
}

    public void dfs(char[][] grid,int i,int j, int m, int n){
        if(i >= m || j >= n || i < 0 || j < 0){
            return;
        }
        if(grid[i][j] == '1'){
            grid[i][j] = '0';
            dfs(grid, i+1, j, m, n);
            dfs(grid, i, j+1, m, n);
            dfs(grid, i, j-1, m, n);
            dfs(grid, i-1, j, m, n);
        }
    }

}
