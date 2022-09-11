package com.algorithm.likou.p801_p900;

/**
 * @ClassName:p844_比较含退格的字符串
 * @Auther: Lyh
 * @Date: 2022/7/14 17:26
 * @Version: v1.0
 */
public class p844_比较含退格的字符串 {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {
            //先找到第一个可以比较大小的字符
            while (i >= 0) {
                if (S.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }
            while (j >= 0) {
                if (T.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }
            if (i >= 0 && j >= 0) {
                //如果可以比较
                if (S.charAt(i) != T.charAt(j)) {
                    return false;
                }
            } else {
                //如果一个可以比较一个不可以比较
                if (i >= 0 || j >= 0) {
                    return false;
                }
            }
            i--;
            j--;
        }
        return true;
    }

}
