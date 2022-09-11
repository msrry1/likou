package com.algorithm.likou.p501_p600;

/**
 * @ClassName:p583_两个字符串的删除操作
 * @Auther: Lyh
 * @Date: 2022/7/27 15:01
 * @Version: v1.0
 */
public class p583_两个字符串的删除操作 {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 1;i <= n;i++){
            dp[0][i] = i;
        }
        for(int j = 1;j <= m;j++){
            dp[j][0] = j;
        }
        for(int i = 1;i <= m;i++){
            char c1 = word1.charAt(i-1);
            for(int j = 1;j <= n;j++){
                if(c1 != word2.charAt(j-1)){
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + 1;
                } else{
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[m][n];
    }
}
