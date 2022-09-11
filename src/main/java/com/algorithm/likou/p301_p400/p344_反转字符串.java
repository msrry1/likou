package com.algorithm.likou.p301_p400;

/**
 * @ClassName:p344_反转字符串
 * @Auther: Lyh
 * @Date: 2022/6/30 16:46
 * @Version: v1.0
 */
public class p344_反转字符串 {
    public void reverseString(char[] s) {
        int p = 0,q = s.length-1;
        while(p < q){
            char temp = s[p];
            s[p] = s[q];
            s[q] = temp;
            p++;
            q--;
        }
    }
}
