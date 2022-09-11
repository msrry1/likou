package com.algorithm.likou.p1401_p1500;

/**
 * @ClassName:p1455_检查单词是否为句中其他单词的前缀
 * @Auther: Lyh
 * @Date: 2022/8/21 14:11
 * @Version: v1.0
 */
public class p1455_检查单词是否为句中其他单词的前缀 {

    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strs = sentence.split(" ");
        for(int i = 0;i < strs.length;i++){
            if(strs[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}
