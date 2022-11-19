package com.algorithm.likou.p301_p400;

/**
 * @ClassName:p375_猜数字大小II
 * @Auther: Lyh
 * @Date: 2022/9/28 15:38
 * @Version: v1.0
 */
public class p375_猜数字大小II {
    public static int getMoneyAmount(int n) {
        int[][] f = new int[n+1][n+1];
        //f(i,j)= i≤k≤j min{k+max(f(i,k−1),f(k+1,j))}
        for (int i = n - 1; i >= 1; i--) {
            for (int j = i + 1; j <= n; j++) {
                f[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    f[i][j] = Math.min(f[i][j], k + Math.max(f[i][k - 1], f[k + 1][j]));
                }
            }
        }
        return f[1][n];
    }

    public static void main(String[] args) {
        System.out.println(getMoneyAmount(10));
    }
}
