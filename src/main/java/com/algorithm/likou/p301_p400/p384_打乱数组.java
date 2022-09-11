package com.algorithm.likou.p301_p400;

import java.util.Random;

/**
 * @ClassName:p384_打乱数组
 * @Auther: Lyh
 * @Date: 2022/7/30 16:23
 * @Version: v1.0
 */
public class p384_打乱数组 {
    int[] nums;
    int[] original;

    public void Solution(int[] nums) {
        this.nums = nums;
        this.original = new int[nums.length];
        System.arraycopy(nums, 0, original, 0, nums.length);
    }

    public int[] reset() {
        System.arraycopy(original, 0, nums, 0, nums.length);
        return nums;
    }

    public int[] shuffle() {
        Random random = new Random();
        for (int i = 0; i < nums.length; ++i) {
            int j = i + random.nextInt(nums.length - i);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}
