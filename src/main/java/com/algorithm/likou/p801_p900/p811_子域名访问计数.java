package com.algorithm.likou.p801_p900;

import java.util.*;

/**
 * @ClassName:p811_子域名访问计数
 * @Auther: Lyh
 * @Date: 2022/10/5 19:11
 * @Version: v1.0
 */
public class p811_子域名访问计数 {

    public static void main(String[] args) {
        String s = "9001 discuss.leetcode.com";
        String[] strings = new String[1];
        strings[0] = s;
        System.out.println(subdomainVisits(strings));
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> map = new HashMap();
        for(String str : cpdomains){
            String[] s = str.split(" ");
            Integer count = Integer.valueOf(s[0]);
            StringBuilder sb = new StringBuilder();
            String[] rex = s[1].split("\\.");
            sb.append(rex[rex.length-1]);
            if(map.containsKey(sb.toString())){
                map.put(sb.toString(), map.get(sb.toString()) + count);
            } else{
                map.put(sb.toString(), count);
            }
            for(int i = rex.length-2;i >= 0;i--){
                sb.insert(0,rex[i].toString() + ".");
                if(map.containsKey(sb.toString())){
                    map.put(sb.toString(), map.get(sb.toString()) + count);
                } else{
                    map.put(sb.toString(), count);
                }
            }
        }
        List<String> res = new ArrayList<>();
        Set<String> strings = map.keySet();
        for(String c : strings){
            Integer cc = map.get(c);
            res.add(String.valueOf(cc) + " " + c);
        }
        return res;
    }
}
