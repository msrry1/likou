package com.algorithm.likou.p701_p800;

/**
 * @ClassName:p769_最多能完成排序的块
 * @Auther: Lyh
 * @Date: 2022/10/13 10:31
 * @Version: v1.0
 */
public class p769_最多能完成排序的块 {
    public int maxChunksToSorted(int[] arr) {
        int ans = 0, mx = 0;
        for (int i = 0; i < arr.length; ++i) {
            mx = Math.max(mx, arr[i]);
            if (i == mx) {
                ++ans;
            }
        }
        return ans;
    }

}
