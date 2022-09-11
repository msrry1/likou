package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p202_快乐数
 * @Auther: Lyh
 * @Date: 2022/7/30 16:21
 * @Version: v1.0
 */
public class p202_快乐数 {
    public boolean isHappy(int n) {
        if(n == 1 || n == 7){
            return true;
        }
        if(n <= 9){
            return false;
        }
        int nextN = 0;
        int x = n;
        while(x != 0){
            int t = x % 10;
            nextN += t * t;
            x /= 10;
        }
        return isHappy(nextN);
    }
}
