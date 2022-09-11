package com.algorithm.likou.p201_p300;

import java.util.Arrays;

/**
 * @ClassName:p242_有效的字母异位词
 * @Auther: Lyh
 * @Date: 2022/7/2 20:41
 * @Version: v1.0
 */
public class p242_有效的字母异位词 {
    public boolean isAnagram(String s, String t) {
        int ns = s.length();
        int nt = t.length();
        if(ns != nt){
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        return  String.valueOf(s1).equals(String.valueOf(t1));
    }
}
