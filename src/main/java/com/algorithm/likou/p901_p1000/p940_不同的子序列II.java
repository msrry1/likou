package com.algorithm.likou.p901_p1000;

/**
 * @ClassName:p940_不同的子序列II
 * @Auther: Lyh
 * @Date: 2022/10/14 10:28
 * @Version: v1.0
 */
public class p940_不同的子序列II {
    public int distinctSubseqII(String s) {
        final int MOD = 1000000007;
        int[] g = new int[26];
        int n = s.length(), total = 0;
        for (int i = 0; i < n; ++i) {
            int oi = s.charAt(i) - 'a';
            int prev = g[oi];
            g[oi] = (total + 1) % MOD;
            total = ((total + g[oi] - prev) % MOD + MOD) % MOD;
        }
        return total;
    }
}
