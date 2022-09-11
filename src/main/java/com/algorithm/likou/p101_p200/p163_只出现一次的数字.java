package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p163_只出现一次的数字
 * @Auther: Lyh
 * @Date: 2022/7/10 12:13
 * @Version: v1.0
 */
public class p163_只出现一次的数字 {
    public int singleNumber(int[] nums) {
        int p = nums[0];
        for(int i = 1;i < nums.length;i++){
            p = p ^ nums[i];
        }
        return p;
    }
}
