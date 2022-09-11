package com.algorithm.likou.p101_p200;

import java.util.Arrays;

/**
 * @ClassName:p169_多数元素
 * @Auther: Lyh
 * @Date: 2022/7/11 12:55
 * @Version: v1.0
 */
public class p169_多数元素 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
