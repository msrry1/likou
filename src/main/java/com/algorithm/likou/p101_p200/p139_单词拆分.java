package com.algorithm.likou.p101_p200;

import java.util.List;

/**
 * @ClassName:p139_单词拆分
 * @Auther: Lyh
 * @Date: 2022/7/25 17:11
 * @Version: v1.0
 */
public class p139_单词拆分 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
    // public boolean wordBreak(String s, List<String> wordDict) {
    //     return pin(s, wordDict,0);
    // }
    // boolean flag = false;
    // public boolean pin(String s, List<String> wordDict, int index){
    //     if(index == s.length()){
    //         return true;
    //     }
    //     String c = "";
    //     for(int i = index;i < s.length();i++){
    //         c += String.valueOf(s.charAt(i));
    //         if(wordDict.contains(c)){
    //             flag = pin(s, wordDict, i + 1);
    //             if(flag == true){
    //                 return flag;
    //             }
    //         }
    //     }
    //     return false;
    // }
}
