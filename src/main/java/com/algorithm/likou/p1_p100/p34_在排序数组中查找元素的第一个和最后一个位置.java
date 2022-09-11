package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p34_在排序数组中查找元素的第一个和最后一个位置
 * @Auther: Lyh
 * @Date: 2022/7/11 11:17
 * @Version: v1.0
 */
public class p34_在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        if(nums == null){
            return new int[] {-1, -1};
        }
        int length = nums.length;
        int left = 0, right = length-1;
//        while(left <= right){
//            if(nums[left] == target && nums[right] == target){
//                return new int[] {left, right};
//            }
//            if(nums[left] != target){
//                left++;
//            }
//            if(nums[right] != target){
//                right--;
//            }
//        }
        //不考虑数值溢出
        int mid = (right + left)/2;
        //因为可以出现第一个和最后一个都是同一个位置
        while(left <= right){
            //出口判断
            if(nums[left] == target && nums[right] == target){
                return new int[] {left, right};
            }
            //因为增序，所以可以快速改变左右指针位置
            if(nums[mid] > target){
                right = mid;
            } else if(nums[mid] < target){
                left = mid;
            }
            if(nums[left] != target){
                left++;
            }
            if(nums[right] != target){
                right--;
            }
            //重置mid
            mid = (right+left)/2;
        }
        return new int[] {-1, -1};
    }
}
