package com.algorithm.面试题;

import java.util.Arrays;

/**
 * @ClassName:p17_09_第k个数
 * @Auther: Lyh
 * @Date: 2022/9/28 00:30
 * @Version: v1.0
 */
public class p17_09_第k个数 {
    public int getKthMagicNumber(int k) {

        int a = 1;
        int b = 1;
        int c = 1;
        int[] dp = new int[k+1];
        dp[1] = 1;
        for(int i = 2;i <= k;i++){
            int na = dp[a]*3;
            int nb = dp[b]*5;
            int nc = dp[c]*7;
            dp[i] = Math.min(na,Math.min(nb,nc));
            if(dp[i] == na){
                a++;
            }
            if(dp[i] == nb){
                b++;
            }
            if(dp[i] == nc){
                c++;
            }
        }
        return dp[k];
    }
}
