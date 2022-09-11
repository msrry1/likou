package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p55_跳跃游戏
 * @Auther: Lyh
 * @Date: 2022/7/22 16:54
 * @Version: v1.0
 */
public class p55_跳跃游戏 {
    public boolean canJump(int[] nums) {
        int len = nums.length - 1;
        int max = nums[0];
        for(int i = 0;i <= max;i++){
            max = Math.max(max, nums[i] + i);
            if(max >= len){
                return true;
            }
        }
        return false;
    }
}
