package com.algorithm.likou.p400_p500;

/**
 * @ClassName:p415_字符串相加
 * @Auther: Lyh
 * @Date: 2022/7/16 00:33
 * @Version: v1.0
 */
public class p415_字符串相加 {
    //大数相加，从两个字符串最后一位开始
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while(i >= 0 || j >= 0){
            //挺骚的，不需要管i,j不合法的值了，还清晰
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            //当前两个字符串对应位数数值相加
            int tmp = n1 + n2 + carry;
            //进位
            carry = tmp / 10;
            //实际相加值
            res.append(tmp % 10);
            i--; j--;
        }
        //如果还有进位
        if(carry == 1) res.append(1);
        //倒过来
        return res.reverse().toString();
    }
}
