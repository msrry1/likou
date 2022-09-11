package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p283_移动0
 * @Auther: Lyh
 * @Date: 2022/6/29 23:16
 * @Version: v1.0
 */
public class p283_移动0 {
    public void moveZeroes(int[] nums) {
        for(int i = 0;i < nums.length;i++){
            int p = nums[i];
            if(nums[i] == 0){
                for(int j = i + 1;j < nums.length;j++){
                    if(nums[j] != 0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
    }
}
