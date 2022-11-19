package com.algorithm.likou.p701_p800;

/**
 * @ClassName:p779_第k个语法符号
 * @Auther: Lyh
 * @Date: 2022/10/21 09:37
 * @Version: v1.0
 */
public class p779_第k个语法符号 {
    public int kthGrammar(int n, int k) {
        if(n == 1){
            return 0;
        }
        //对应上一行变换过来的2个中的第几个
        int c = k%2;
        //对应上一行变换过来的k
        k = (int)Math.ceil((double)k/2);
        if(kthGrammar(n-1,k) == 0){ //如果该n行第k个是由0变换过来的
            //c==1表示01中的0，0表示01中的1
            return c == 0 ? 1 : 0;
        }else{
            return c == 1 ? 1 : 0;
        }
    }

}
