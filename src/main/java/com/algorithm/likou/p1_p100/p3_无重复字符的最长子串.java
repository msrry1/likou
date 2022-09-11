package com.algorithm.likou.p1_p100;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:p3_无重复字符的最长子串
 * @Auther: Lyh
 * @Date: 2022/7/2 22:14
 * @Version: v1.0
 */
public class p3_无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        //k:字符，v:此字符的下一个字符的下标
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0, start = 0; end < n; end++) {
            char alpha = s.charAt(end);
            if (map.containsKey(alpha)) {
                //如果找到重复字符，更新开始下标
                start = Math.max(map.get(alpha), start);
            }
            //更新最长子串长度
            ans = Math.max(ans, end - start + 1);

            map.put(s.charAt(end), end + 1);
        }
        return ans;

    }
}
