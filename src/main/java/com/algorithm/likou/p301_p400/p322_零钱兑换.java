package com.algorithm.likou.p301_p400;

import java.util.Arrays;

/**
 * @ClassName:p322_零钱兑换
 * @Auther: Lyh
 * @Date: 2022/7/28 14:18
 * @Version: v1.0
 */
public class p322_零钱兑换 {
    //coins=[1, 2, 5]时，amount=6时，
    //dp[6] = min(dp[1], dp[4], dp[5]) + 1
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
