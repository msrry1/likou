package com.algorithm.likou.p301_p400;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:p387_字符串中的第一个唯一字符
 * @Auther: Lyh
 * @Date: 2022/7/2 15:02
 * @Version: v1.0
 */
public class p387_字符串中的第一个唯一字符 {
    public int firstUniqChar(String s) {
        int length = s.length();
        if(length == 1){
            return 0;
        }
        //k:字符，v:下标，下标为-1时表示重复
        Map<Character, Integer> map = new HashMap();
        for(int i = 0;i < length;i++){
            char c = s.charAt(i);
            if(map.get(c) == null){
                map.put(c, i);
            } else{
                if(map.get(c) != -1){
                    map.put(c, -1);
                }
            }
        }
        for(int i = 0;i < length;i++){
            char c = s.charAt(i);
            if(map.get(c) != -1){
                return i;
            }
        }
        return -1;
    }
}
