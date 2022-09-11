package com.algorithm.likou.p400_p500;

/**
 * @ClassName:p409_最长回文串
 * @Auther: Lyh
 * @Date: 2022/7/16 00:42
 * @Version: v1.0
 */
public class p409_最长回文串 {
    public int longestPalindrome(String s) {
        int ns = s.length();
        int ret = 0;
        int[] da = new int[26];
        int[] xi = new int[26];
        for(int i = 0;i < ns;i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z'){
                //小写字母
                xi[c-'a']++;
            } else{
                //大写字母
                da[c-'A']++;
            }
        }
        int flag = 0;
        for(int i = 0;i < 26;i++){
            if(flag == 0 && (da[i]%2 != 0 || xi[i]%2 != 0)){
                flag = 1;
            }
            if(da[i] >= 2){
                ret += da[i]/2*2;
            }
            if(xi[i] >= 2){
                ret += xi[i]/2*2;
            }
        }
        if(flag == 1){
            ret++;
        }
        return ret;
    }
}
