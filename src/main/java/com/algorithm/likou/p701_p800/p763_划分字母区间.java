package com.algorithm.likou.p701_p800;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p763_划分字母区间
 * @Auther: Lyh
 * @Date: 2022/7/17 12:56
 * @Version: v1.0
 */
public class p763_划分字母区间 {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> partition = new ArrayList<Integer>();
        int start = 0, end = 0;
        for (int i = 0; i < length; i++) {
            end = Math.max(end, last[s.charAt(i) - 'a']);
            //如果确定了一个区间
            if (i == end) {
                partition.add(end - start + 1);
                start = end + 1;
            }
        }
        return partition;
    }
}
