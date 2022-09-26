package com.algorithm.likou.p301_p400;

/**
 * @ClassName:p309_最佳买卖股票时机含冷冻期
 * @Auther: Lyh
 * @Date: 2022/9/26 20:25
 * @Version: v1.0
 */
public class p309_最佳买卖股票时机含冷冻期 {
    public int maxProfit(int[] prices) {
        //1.第i天有股票
        //2.第i天没股票，因为今天卖了
        //3.第i天没股票，因为第i-1天没给股票
        int a = -prices[0];
        int b = 0;
        int c = 0;
        for(int i = 0;i < prices.length;i++){
            //如果今天要有股票，那么是前一天a或c-prices[i]
            int pa = Math.max(a,c-prices[i]);
            //如果今天没有股票，因为今天卖了，那么昨天一定有股票
            int pb = a + prices[i];
            //如果今天没有股票，因为昨天没给股票，那么昨天没股票
            int pc = Math.max(b, c);
            a = pa;
            b = pb;
            c = pc;
        }
        return Math.max(b, c);
    }
}
