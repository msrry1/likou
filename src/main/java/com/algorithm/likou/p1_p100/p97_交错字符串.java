package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p97_交错字符串
 * @Auther: Lyh
 * @Description: p97_交错字符串
 * @Date: 2022/5/31 20:06
 * @Version: v1.0
 */
public class p97_交错字符串 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1 = s1.length();
        int len2 = s2.length();
        int len3 = s3.length();

        //不可能交错
        if(len1 + len2 != len3){
            return false;
        }


        //dp[i][j] 表示 s1前 i 个字符和 s2前 j 个字符拼接后的字符可以交错组成 s3 的前 i + j
        //个字符
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];

        dp[0][0] = true;
        //初始化第一列：上一个为 T 同时s1该位置的字符等于s3对应位置的字符
        for(int i = 1;i <= len1;i++){
            dp[i][0] = dp[i-1][0] && (s1.charAt(i-1) == s3.charAt(i-1));
        }
        //初始化第一行，前一个为 T 同时s2该位置的字符等于s3对应位置的字符
        for(int j = 1;j <= len2;j++){
            dp[0][j] = dp[0][j-1] && (s2.charAt(j-1) == s3.charAt(j-1));
        }

        for(int i = 1;i <= len1;i++){
            for(int j = 1;j <= len2;j++){
                int p = i + j - 1;//s3 到的字符
                //从左边可以到同时满足该列此字符和s3字符相同或者
                //从上面可以到同时满足该行此字符和s3字符相同
                if((dp[i][j-1] && (s2.charAt(j-1) == s3.charAt(p))) ||
                        dp[i-1][j] && (s1.charAt(i-1) == s3.charAt(p))){
                    dp[i][j] = true;
                }
            }
        }

        return dp[len1][len2];

    }
}
