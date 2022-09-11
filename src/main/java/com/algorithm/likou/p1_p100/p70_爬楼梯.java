package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p70_爬楼梯
 * @Auther: Lyh
 * @Date: 2022/7/8 23:07
 * @Version: v1.0
 */
public class p70_爬楼梯 {
    //爬上第n阶的方法等于爬上第n-1阶的方法加爬上第n-2阶的方法
    public int climbStairs(int n) {
        int[] method = new int[46];
        method[1] = 1;
        method[2] = 2;

        int i = 3;
        while(i <= n){
            method[i] = method[i-1] + method[i-2];
            i++;
        }
        return method[n];
    }
}
