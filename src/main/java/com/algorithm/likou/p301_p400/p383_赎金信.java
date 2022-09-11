package com.algorithm.likou.p301_p400;

/**
 * @ClassName:p383_赎金信
 * @Auther: Lyh
 * @Date: 2022/7/2 19:51
 * @Version: v1.0
 */
public class p383_赎金信 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c - 'a']--;
            if(cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
