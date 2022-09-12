package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p122_买卖股票的最佳时机II
 * @Auther: Lyh
 * @Date: 2022/9/12 19:51
 * @Version: v1.0
 */
public class p122_买卖股票的最佳时机II {

}
class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i = 1;i < n;i++){
            if(prices[i] > prices[i-1]){
                dp[i] = prices[i] - prices[i-1] + dp[i-1];
            } else{
                dp[i] = dp[i-1];
            }
        }
        return dp[n-1];
    }
}
