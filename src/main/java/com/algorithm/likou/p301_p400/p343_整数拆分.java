package com.algorithm.likou.p301_p400;

/**
 * @ClassName:p343_整数拆分
 * @Auther: Lyh
 * @Date: 2022/7/28 14:39
 * @Version: v1.0
 */
public class p343_整数拆分 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        for(int i = 2;i <= n;i++){
            for(int j = 1;j < i;j++){
                int k = i - j;
                int dpn = Math.max(j*k, j*dp[k]);
                dp[i] = Math.max(dp[i], dpn);
            }
        }

        return dp[n];
    }
}
