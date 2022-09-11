package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p53_最大子数组和
 * @Auther: Lyh
 * @Date: 2022/6/27 16:10
 * @Version: v1.0
 */
public class p53_最大子数组和 {
    public int maxSubArray(int[] nums) {
        //动态规划，nums[i] = nums[i-1] > 0 ? nums[i] + nums[i - 1] : nums[i]
        int res = nums[0];
        for(int i = 1;i < nums.length;i++){
            nums[i] = nums[i-1] > 0 ? nums[i] + nums[i-1] : nums[i];
            res = Math.max(res, nums[i]);
        }
        return res;
    }
}
