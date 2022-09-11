package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p231_2的幂
 * @Auther: Lyh
 * @Date: 2022/7/9 17:08
 * @Version: v1.0
 */
public class p231_2的幂 {
    public boolean isPowerOfTwo(int n) {
        //该位运算技巧可以直接将 nn 二进制表示的最低位 11 移除
        return n > 0 && (n & (n-1)) == 0;
    }
}
