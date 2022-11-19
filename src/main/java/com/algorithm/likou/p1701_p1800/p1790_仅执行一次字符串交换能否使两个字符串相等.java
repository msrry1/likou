package com.algorithm.likou.p1701_p1800;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p1790_仅执行一次字符串交换能否使两个字符串相等
 * @Auther: Lyh
 * @Date: 2022/10/11 13:51
 * @Version: v1.0
 */
public class p1790_仅执行一次字符串交换能否使两个字符串相等 {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        List<Integer> diff = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (diff.size() >= 2) {
                    return false;
                }
                diff.add(i);
            }
        }
        if (diff.isEmpty()) {
            return true;
        }
        if (diff.size() != 2) {
            return false;
        }
        return s1.charAt(diff.get(0)) == s2.charAt(diff.get(1)) && s1.charAt(diff.get(1)) == s2.charAt(diff.get(0));
    }
}
