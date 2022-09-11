package com.algorithm.likou.p301_p400;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:p350_两个数的交集II
 * @Auther: Lyh
 * @Date: 2022/6/29 21:32
 * @Version: v1.0
 */
public class p350_两个数的交集II {
    public int[] intersect(int[] nums1, int[] nums2) {
        //确保nums1的长度小于nums2的长度
        if(nums1.length > nums2.length){
            return intersect(nums2, nums1);
        }
        //key为值，value为key出现的次数
        Map<Integer, Integer> map = new HashMap();
        for(int c : nums1){
            if(map.get(c) != null){
                map.put(c, map.get(c) + 1);
            } else{
                map.put(c, 1);
            }
        }

        int[] res = new int[nums1.length];
        int p = 0;
        for(int c : nums2){
            if(map.get(c) != null && map.get(c) > 0){
                res[p++] = c;
                map.put(c, map.get(c) - 1);
            }
        }
        return  Arrays.copyOfRange(res, 0, p);
    }
}
