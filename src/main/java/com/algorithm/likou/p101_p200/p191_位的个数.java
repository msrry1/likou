package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p191_位的个数
 * @Auther: Lyh
 * @Date: 2022/7/9 18:45
 * @Version: v1.0
 */
public class p191_位的个数 {
    public int hammingWeight(int n) {
        int ret = 0;
        while (n != 0) {
            //每次把最低位的1变为0
            n &= n - 1;
            ret++;
        }
        return ret;
    }
}
