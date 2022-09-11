package com.algorithm.likou.p501_p600;

import java.util.HashMap;

/**
 * @ClassName:p560_和为k的子数组
 * @Auther: Lyh
 * @Date: 2022/7/15 11:20
 * @Version: v1.0
 */
public class p560_和为k的子数组 {
    public int subarraySum(int[] nums, int k) {
        int count = 0, pre = 0;
        //k:和  v:和对应的次数
        HashMap < Integer, Integer > mp = new HashMap< >();
        //前缀和初始化
        mp.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            pre += nums[i];
            //符合条件的j为 pre[j-1] = pre[i] - k
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }
        return count;
    }
}
