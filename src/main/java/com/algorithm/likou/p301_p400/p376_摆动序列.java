package com.algorithm.likou.p301_p400;

/**
 * @ClassName:p376_摆动序列
 * @Auther: Lyh
 * @Date: 2022/10/3 20:43
 * @Version: v1.0
 */
public class p376_摆动序列 {
    public int wiggleMaxLength(int[] nums) {
        int down = 1, up = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1])
                up = down + 1;
            else if (nums[i] < nums[i - 1])
                down = up + 1;
        }
        return nums.length == 0 ? 0 : Math.max(down, up);
    }
}
