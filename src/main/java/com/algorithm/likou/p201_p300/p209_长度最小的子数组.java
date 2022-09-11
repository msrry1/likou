package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p209_长度最小的子数组
 * @Auther: Lyh
 * @Date: 2022/7/15 14:36
 * @Version: v1.0
 */
public class p209_长度最小的子数组 {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;

        while (end < n) {
            sum += nums[end];
            //找新的start
            while (sum >= s) {
                ans = Math.min(ans, end - start + 1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
