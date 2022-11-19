package com.algorithm.likou.p901_p1000;

/**
 * @ClassName:最大为N的数字组合
 * @Auther: Lyh
 * @Date: 2022/10/18 09:24
 * @Version: v1.0
 */
public class p902_最大为N的数字组合 {

    public static int atMostNGivenDigitSet(String[] digits, int n) {
        int ns = digits.length;
        int c = Integer.valueOf(digits[ns-1]);
        int x = c;
        int res = 0;
        int t = 1;
        while(c <= n){
            res += (int)Math.pow(ns,t);
            t++;
            c = x + 10*c;
        }
        String num = String.valueOf(n);
        char[] nums = num.toCharArray();
        if(t == nums.length){
            int nn1 = Character.valueOf(nums[0]);
            int tt = 0;
            for(int i = 0;i < ns;i++){
                if(nn1 > Integer.valueOf(digits[i])){
                    t++;
                }else{
                    break;
                }
            }
            res = res + tt * (int)(Math.pow(ns,ns-1));

        }
        return res;
    }

    public static void main(String[] args) {
        String[] di = {"1","4","9"};
        System.out.println(atMostNGivenDigitSet(di,1000000000));
    }
}
