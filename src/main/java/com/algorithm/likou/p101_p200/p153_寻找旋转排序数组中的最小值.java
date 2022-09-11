package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p153
 * @Auther: Lyh
 * @Date: 2022/7/12 14:21
 * @Version: v1.0
 */
public class p153_寻找旋转排序数组中的最小值 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) {
                //最小值在右边
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
