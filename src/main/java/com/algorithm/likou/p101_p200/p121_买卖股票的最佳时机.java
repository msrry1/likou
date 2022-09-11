package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p121_买卖股票的最佳时机
 * @Auther: Lyh
 * @Date: 2022/6/29 21:51
 * @Version: v1.0
 *
 * 每天都想如果我现在卖股票，利润是否超过最大利润
 *
 */
public class p121_买卖股票的最佳时机 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int minprice = Integer.MAX_VALUE;
        for(int i = 0;i < prices.length;i++){
            if(prices[i] < minprice){
                minprice = prices[i];
            } else if(prices[i] - minprice > profit){
                profit = prices[i] - minprice;
            }
        }
        return profit;
    }
}
