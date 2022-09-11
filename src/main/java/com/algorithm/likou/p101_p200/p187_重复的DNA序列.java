package com.algorithm.likou.p101_p200;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName:p187_重复的DNA序列
 * @Auther: Lyh
 * @Date: 2022/7/19 17:52
 * @Version: v1.0
 */
public class p187_重复的DNA序列 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ret = new ArrayList();
        if(s == null){
            return ret;
        }
        int n = s.length();
        if(n < 11){
            return ret;
        }
        Map<String, Integer> map = new HashMap();
        for(int i = 0;i <= n - 10;i++){
            String t = s.substring(i, i + 10);
            if(map.containsKey(t)){
                map.put(t, map.get(t) + 1);
            } else{
                map.put(t, 1);
            }
        }
        for(Map.Entry e : map.entrySet()){
            if((int)e.getValue() >= 2){
                ret.add((String)e.getKey());
            }
        }
        return ret;
    }
}
