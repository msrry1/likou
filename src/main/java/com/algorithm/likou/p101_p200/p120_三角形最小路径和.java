package com.algorithm.likou.p101_p200;

import java.util.Collections;
import java.util.List;

/**
 * @ClassName:p120_三角形最小路径和
 * @Auther: Lyh
 * @Date: 2022/7/9 16:53
 * @Version: v1.0
 */
public class p120_三角形最小路径和 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[201];
        Collections.reverse(triangle);
        int depth = 0;
        for (List<Integer> row : triangle) {
            depth++;
            for (int i = 0; i < row.size(); i++) {
                if (depth == 1) {
                    dp[i] = row.get(i);
                } else {
                    dp[i] = Math.min(dp[i], dp[i + 1]) + row.get(i);
                }
            }
        }
        return dp[0];
    }
}
