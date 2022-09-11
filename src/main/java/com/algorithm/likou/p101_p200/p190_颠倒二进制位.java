package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p190_颠倒二进制位
 * @Auther: Lyh
 * @Date: 2022/7/10 12:36
 * @Version: v1.0
 */
public class p190_颠倒二进制位 {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
}
