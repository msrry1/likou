package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p152_乘积最大子数组
 * @Auther: Lyh
 * @Date: 2022/9/13 08:39
 * @Version: v1.0
 */
public class p152_乘积最大子数组 {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int[] maxF = new int[length];//maxF[i]  以i结尾最大乘积
        int[] minF = new int[length];//minF[i]  以i结尾最小乘积
        System.arraycopy(nums, 0, maxF, 0, length);
        System.arraycopy(nums, 0, minF, 0, length);
        for (int i = 1; i < length; ++i) {
            //三个之中最大 maxF[i-1]*nums[i]    正正
            //nums[i] 负正 正负
            //minF[i-1]*nums[i]  负负
            maxF[i] = Math.max(maxF[i - 1] * nums[i], Math.max(nums[i], minF[i - 1] * nums[i]));
            //三个之中最小  minF[i-1]*nums[i]  负正
            //nums[i]  正正  负负
            //maxF[i-1]*nums[i]  正负
            minF[i] = Math.min(minF[i - 1] * nums[i], Math.min(nums[i], maxF[i - 1] * nums[i]));
        }
        int ans = maxF[0];
        for (int i = 1; i < length; ++i) {
            ans = Math.max(ans, maxF[i]);
        }
        return ans;
    }
}
