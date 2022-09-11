package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p189_轮转数组
 * @Auther: Lyh
 * @Date: 2022/6/29 23:54
 * @Version: v1.0
 */
public class p189_轮转数组 {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
