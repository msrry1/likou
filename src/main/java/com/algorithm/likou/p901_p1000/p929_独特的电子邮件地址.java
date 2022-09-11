package com.algorithm.likou.p901_p1000;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName:p929_独特的电子邮件地址
 * @Auther: Lyh
 * @Date: 2022/6/5 11:22
 * @Version: v1.0
 */
public class p929_独特的电子邮件地址 {

    public int numUniqueEmails(String[] emails) {
        //存储实际邮件地址
        Set<String> set = new HashSet();

        for(String email : emails){
            //对 @ 之前的字符串进行处理
            String s1 = email.substring(0, email.indexOf("@"));
            //存储处理后的字符串
            StringBuilder s2 = new StringBuilder();
            for(int i = 0;i < s1.length();i++){
                // + 表示后面都不要
                if(s1.charAt(i) == '+') {
                    break;
                } else if(s1.charAt(i) != '.'){ // . 不加
                    s2.append(s1.charAt(i));
                }
            }
            //拼接 包括@ 之后的字符
            s2.append(email.substring(email.indexOf("@")));
            //加入到 set 自动去重
            set.add(s2.toString());
        }
        return set.size();
    }


    public static void main(String[] args) {
        String s = "abc+.de.fge@qq.com";
        String t = "abcdefge@qq.com";
        String s1 = s.substring(0, s.indexOf("@"));
        StringBuilder s2 = new StringBuilder();
        for(int i = 0;i < s1.length();i++){
            if(s1.charAt(i) == '+') {
                break;
            } else if(s1.charAt(i) != '.'){
                s2.append(s1.charAt(i));
            }
        }
        String s3 = s2.toString();
        String[] split = s.split("+");
        System.out.println(Arrays.toString(split));
        System.out.println(split.length);
    }
}
