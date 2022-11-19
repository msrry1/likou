package com.algorithm.likou.p1601_p1700;

/**
 * @ClassName:p1694_重新格式化电话号码
 * @Auther: Lyh
 * @Date: 2022/10/1 10:51
 * @Version: v1.0
 */
public class p1694_重新格式化电话号码 {
    public String reformatNumber(String number) {
        String s = number.replace(" ", "").replace("-", "");
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i += 3) {
            if (sb.length() != 0) sb.append("-");
            if (i + 5 > n) {
                if (i + 3 >= n) sb.append(s.substring(i));
                else sb.append(s.substring(i, i + 2)).append("-").append(s.substring(i + 2));
                break;
            }
            sb.append(s.substring(i, i + 3));
        }
        return sb.toString();
    }
}