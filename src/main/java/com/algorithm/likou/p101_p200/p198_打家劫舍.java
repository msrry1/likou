package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p198_打家劫舍
 * @Auther: Lyh
 * @Date: 2022/7/9 16:43
 * @Version: v1.0
 */
public class p198_打家劫舍 {
    public int rob(int[] nums) {

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if(nums.length == 1){
            return dp[0];
        }
        dp[1] = Math.max(dp[0], nums[1]);
        for(int i = 2;i < nums.length;i++){
            dp[i] = Math.max(dp[i-2] + nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}
