package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p63_不同路径II
 * @Auther: Lyh
 * @Date: 2022/9/11 16:12
 * @Version: v1.0
 */
public class p63_不同路径II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //dp[i][j]表示走到(i,j)有多少不同路径
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(obstacleGrid[i][j] != 1){
                    if(i == 0 && j == 0){
                        dp[i][j] = 1;
                    }else if(i == 0){
                        dp[i][j] = dp[i][j-1];
                    }else if(j == 0){
                        dp[i][j] = dp[i-1][j];
                    }else{
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    }
                }
            }
        }


        return dp[m-1][n-1];
    }
}
