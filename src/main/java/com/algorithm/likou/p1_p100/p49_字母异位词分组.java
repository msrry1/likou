package com.algorithm.likou.p1_p100;

import java.util.*;

/**
 * @ClassName:p49_字母异位词分组
 * @Auther: Lyh
 * @Date: 2022/7/18 22:33
 * @Version: v1.0
 */
public class p49_字母异位词分组 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
