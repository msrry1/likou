package com.algorithm.likou.p901_p1000;

/**
 * @ClassName:p997_找到小镇的法官
 * @Auther: Lyh
 * @Date: 2022/7/29 14:23
 * @Version: v1.0
 */
public class p997_找到小镇的法官 {
    public int findJudge(int n, int[][] trust) {
        int[] inDegrees = new int[n + 1];
        int[] outDegrees = new int[n + 1];
        for (int[] edge : trust) {
            int x = edge[0], y = edge[1];
            ++inDegrees[y];
            ++outDegrees[x];
        }
        for (int i = 1; i <= n; ++i) {
            if (inDegrees[i] == n - 1 && outDegrees[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
