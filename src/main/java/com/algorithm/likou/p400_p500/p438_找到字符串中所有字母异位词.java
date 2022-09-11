package com.algorithm.likou.p400_p500;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName:p438_找到字符串中所有字母异位词
 * @Auther: Lyh
 * @Date: 2022/7/15 15:26
 * @Version: v1.0
 */
public class p438_找到字符串中所有字母异位词 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ret = new ArrayList();
        int ns = s.length();
        int np = p.length();
        if(np > ns){
            return ret;
        }
        int[] ms = new int[26];
        int[] mp = new int[26];
        for(int i = 0;i < np;i++){
            ms[s.charAt(i) - 'a']++;
            mp[p.charAt(i) - 'a']++;
        }
        if(Arrays.equals(ms, mp)){
            ret.add(0);
        }
        for(int i = 0;i < ns-np;i++){
            --ms[s.charAt(i) - 'a'];
            ++ms[s.charAt(i + np) - 'a'];
            if(Arrays.equals(ms, mp)){
                ret.add(i+1);
            }
        }
        return ret;
    }
}
