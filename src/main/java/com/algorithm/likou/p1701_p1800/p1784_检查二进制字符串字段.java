package com.algorithm.likou.p1701_p1800;

/**
 * @ClassName:p1784_检查二进制字符串字段
 * @Auther: Lyh
 * @Date: 2022/10/3 10:51
 * @Version: v1.0
 */
public class p1784_检查二进制字符串字段 {
    public boolean checkOnesSegment(String s) {
        int n = s.length();
        for(int i = 1;i < n;i++){
            if(s.charAt(i)=='1' && s.charAt(i-1)=='0'){
                return false;
            }
        }
        return true;
    }
}
