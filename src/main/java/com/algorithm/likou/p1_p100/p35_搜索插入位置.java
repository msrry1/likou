package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p35_搜索插入位置
 * @Auther: Lyh
 * @Date: 2022/6/27 18:50
 * @Version: v1.0
 */
public class p35_搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0;i < nums.length;i++){
            if(nums[i] == target){
                return i;
            }
            if(target < nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
