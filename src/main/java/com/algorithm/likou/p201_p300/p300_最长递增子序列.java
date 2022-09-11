package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p300_最长递增子序列
 * @Auther: Lyh
 * @Date: 2022/7/26 15:22
 * @Version: v1.0
 */
public class p300_最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int res = 0;
        for(int num : nums) {
            //在tail[i, j)去取元素
            int i = 0, j = res;
            while(i < j) {
                int m = (i + j) / 2;
                if(tails[m] < num) i = m + 1;
                else j = m;
            }
            tails[j] = num;
            if(res == j) res++;
        }
        return res;
    }
}
