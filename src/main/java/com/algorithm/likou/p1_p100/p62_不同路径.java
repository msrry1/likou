package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p62_不同路径
 * @Auther: Lyh
 * @Date: 2022/7/23 13:50
 * @Version: v1.0
 */
public class p62_不同路径 {
    int sum = 0;

    public int uniquePaths(int m, int n) {

        //dp[i][j] 表示到dp[i][j]有多少条路经
        int[][] dp = new int[m+1][n+1];
        for(int i = 1;i <= m;i++){
            for(int j = 1;j <= n;j++){
                dp[1][j] = 1;
                dp[i][1] = 1;
            }
        }
        for(int i = 2;i <= m;i++){
            for(int j = 2;j <= n;j++){
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        return dp[m][n];
    }
}
