package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p91_解码方法
 * @Auther: Lyh
 * @Date: 2022/7/25 15:17
 * @Version: v1.0
 */
public class p91_解码方法 {
    public int numDecodings(String s) {
        int n = s.length();
        int[] f = new int[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; ++i) {
            //取一个或者取两个
            if (s.charAt(i - 1) != '0') {
                f[i] += f[i - 1];
            }
            if (i > 1 && s.charAt(i - 2) != '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                f[i] += f[i - 2];
            }
        }
        return f[n];
    }
}
