package com.algorithm.likou.p301_p400;

/**
 * @ClassName:p357_统计各位数字都不同的数字个数
 * @Auther: Lyh
 * @Date: 2022/9/28 00:19
 * @Version: v1.0
 */
public class p357_统计各位数字都不同的数字个数 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 10;
        }
        int res = 10, cur = 9;
        for (int i = 0; i < n - 1; i++) {
            cur *= 9 - i;
            res += cur;
        }
        return res;
    }
}
