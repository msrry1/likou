package com.algorithm.likou.p501_p600;

/**
 * @ClassName:p557_反转字符串中的单词III
 * @Auther: Lyh
 * @Date: 2022/6/30 16:44
 * @Version: v1.0
 */
public class p557_反转字符串中的单词III {
    public String reverseWords(String s) {
        String[] rex = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < rex.length;i++){
            String t = rex[i];
            for(int j = t.length()-1;j >= 0;j--){
                sb.append(t.charAt(j));
            }
            if(i != rex.length - 1){
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}
