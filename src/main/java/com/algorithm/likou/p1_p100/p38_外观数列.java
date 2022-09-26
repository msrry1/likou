package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p38_外观数列
 * @Auther: Lyh
 * @Date: 2022/9/25 21:36
 * @Version: v1.0
 */
public class p38_外观数列 {

    public static void main(String[] args) {
        p38_外观数列 p38_外观数列 = new p38_外观数列();
        System.out.println(p38_外观数列.countAndSay(5));
    }
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(1));
        for(int i = 2;i <= n;i++){
            sb = chuli(sb);
        }
        return sb.toString();
    }

    public StringBuilder chuli(StringBuilder sb){
        // n 个 t
        int n = 0;
        char t = 0;
        StringBuilder res = new StringBuilder();
        for(int i = 0;i < sb.length();){
            if(t == sb.charAt(i)){
                n++;
                i++;
            } else{
                if(n == 0){
                    n = 1;
                    t = sb.charAt(i);
                    i++;
                }else{
                    res.append(n);
                    res.append(t);
                    n = 0;
                    t = 0;
                }
            }
        }
        if(n != 0){
            res.append(n);
            res.append(t);
        }
        return res;
    }
}
