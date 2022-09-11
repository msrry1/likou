package com.algorithm.likou.p201_p300;

import java.util.Arrays;
import java.util.Set;

/**
 * @ClassName:p217_存在重复元素
 * @Auther: Lyh
 * @Date: 2022/6/27 15:49
 * @Version: v1.0
 */
public class p217_存在重复元素 {
    public boolean containsDuplicate(int[] nums) {

        // 两个for循环，如果有出现两次的直接返回true，否则返回false
        for(int i = 0;i < nums.length;i++){
            for(int j = i + 1;j < nums.length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
