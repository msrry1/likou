package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p201_数字范围按位与
 * @Auther: Lyh
 * @Date: 2022/7/29 14:07
 * @Version: v1.0
 */
public class p201_数字范围按位与 {
    public int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        // 找到公共前缀
        while (m < n) {
            m >>= 1;
            n >>= 1;
            ++shift;
        }
        return m << shift;
    }
}
