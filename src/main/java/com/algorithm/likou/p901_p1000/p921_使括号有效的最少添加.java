package com.algorithm.likou.p901_p1000;

/**
 * @ClassName:p921_使括号有效的最少添加
 * @Auther: Lyh
 * @Date: 2022/10/4 12:13
 * @Version: v1.0
 */
public class p921_使括号有效的最少添加 {
    public int minAddToMakeValid(String s) {
        int n = s.length();
        int left = 0;
        int right = 0;
        for(int i = 0;i < n;i++){
            if(s.charAt(i) == '('){
                left++;
            } else{
                if(left != 0){
                    left--;
                }else{
                    right++;
                }
            }
        }
        return left + right;
    }
}
