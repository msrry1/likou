package com.algorithm.likou.p201_p300;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName:p290_单词规律
 * @Auther: Lyh
 * @Date: 2022/7/17 11:54
 * @Version: v1.0
 */
public class p290_单词规律 {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        int ns = s1.length;
        int np = pattern.length();
        if(ns != np){
            return false;
        }
        Map<Character, String> map = new HashMap();
        Set<String> set = new HashSet();
        for(int i = 0;i < np;i++){
            char c = pattern.charAt(i);
            //如果map中有这个字符
            if(map.containsKey(c)){
                //如果map中这个字符对应的字符串和当前字符串不同
                if(!map.get(c).equals(s1[i])){
                    return false;
                }
            } else{ //如果map中没有这个字符
                //判断这个字符串是否出现过
                if(set.contains(s1[i])){
                    return false;
                }
                map.put(c, s1[i]);
                set.add(s1[i]);
            }

        }
        return true;
    }
}
