package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p33_搜索旋转排序数组
 * @Auther: Lyh
 * @Date: 2022/7/11 12:37
 * @Version: v1.0
 */
public class p33_搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        int length = nums.length;
        if (length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int left = 0;
        int right = length - 1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            //[left, mid]是有序的
            if (nums[mid] >= nums[left]) {
                //如果在前半部分
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    //如果在后半部分
                    left = mid + 1;
                }
            } else {
                //[mid + 1, right]是有序的
                //如果在后半部分
                if (target >= nums[mid + 1] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    //如果在前半部分
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
