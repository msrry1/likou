package com.algorithm.likou.p1_p100;

public class p72_编辑距离 {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        //dp[i][j] 表示word1[i] -> word2[j] 的最小操作数
        int[][] dp = new int[len1 + 1][len2 + 1];
        //初始化，空串到 word2[j] = j，全增加
        for(int i = 0;i <= len1;i++){
            dp[i][0] = i;
        }
        //初始化，word1[i] -> 空串，全删除
        for(int j = 0;j <= len2;j++){
            dp[0][j] = j;
        }

        //遍历
        //在三个操作找最少操作数
        //horse -> ros
        //dp[i-1][j] + 1：已知 hors -> ros 要 x，所以再删除 e 就可以得到 ros 对应删除操作
        //dp[i][j-1] + 1：已知 horse -> ro 要 y，所以再增加 s 就可以得到 ros 对应增加操作
        //dp[i - 1][j - 1] + 1？：已知 hors -> ro 要 z，所以替换 e -> s 就可以得到 ros
        //但有可能 此时 word1[i-1] == word2[j-1]，就不需要进行替换操作，也就不需要 + 1
        for(int i = 1;i <= len1;i++){
            for(int j = 1;j <= len2;j++){
                int c = 1;
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    c = 0;
                }
                dp[i][j] = Math.min(Math.min(dp[i-1][j] + 1, dp[i][j-1] + 1),dp[i-1][j-1] + c);
            }
        }
        return dp[len1][len2];
    }
}