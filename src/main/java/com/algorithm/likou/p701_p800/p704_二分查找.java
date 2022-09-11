package com.algorithm.likou.p701_p800;

/**
 * @ClassName:p704_二分查找
 * @Auther: Lyh
 * @Date: 2022/6/27 17:42
 * @Version: v1.0
 */
public class p704_二分查找 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            //防止 right + left 越界
            int mid = (right - left) / 2 + left;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
