package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p162_寻找峰值
 * @Auther: Lyh
 * @Date: 2022/7/12 14:44
 * @Version: v1.0
 */
public class p162_寻找峰值 {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;
        for (; left < right; ) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
