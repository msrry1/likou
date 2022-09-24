package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p279_完全平方数
 * @Auther: Lyh
 * @Date: 2022/9/24 22:30
 * @Version: v1.0
 */
public class p279_完全平方数 {
    public int numSquares(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            f[i] = i;
            for(int j = 1;j * j <= i;j++){
                f[i] = Math.min(f[i], f[i - j * j] + 1);
            }
        }
        return f[n];
    }
}
