package com.algorithm.likou.p1_p100;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:p1_两数之和
 * @Auther: Lyh
 * @Date: 2022/6/28 11:13
 * @Version: v1.0
 */
public class p1_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0;i < nums.length;i++){
            Integer p;
            if((p = map.get(target - nums[i])) != null){
                //找到与当前数互补的数的下标
                return new int[] {i, p};
            }
            map.put(nums[i],i);
        }
        return new int[] {0, 1};
    }
}
