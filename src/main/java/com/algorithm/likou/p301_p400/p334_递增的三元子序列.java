package com.algorithm.likou.p301_p400;

/**
 * @ClassName:p334_递增的三元子序列
 * @Auther: Lyh
 * @Date: 2022/7/15 14:16
 * @Version: v1.0
 */
public class p334_递增的三元子序列 {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n < 3){
            return false;
        }
        int left = nums[0];
        int right = Integer.MAX_VALUE;
        for(int i = 1;i < n;i++){
            int num = nums[i];
            if(num > right){
                return true;
            } else if(num > left){
                right = num;
            } else if(num < left){
                left = num;
            }
        }
        return false;
    }
}
