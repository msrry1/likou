package com.algorithm.likou.p901_p1000;

/**
 * @ClassName:p904_水果成篮
 * @Auther: Lyh
 * @Date: 2022/10/17 18:38
 * @Version: v1.0
 */
public class p904_水果成篮 {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        //该种类水果是否被选择
        int[] choose = new int[n];
        int i = 0;
        int j = 0;
        int res = 0;
        //当前选择的所有种类
        int total = 0;
        for(;j < n;j++){
            if(++choose[fruits[j]] == 1){
                total++;
            }
            while(total > 2){
                if(--choose[fruits[i++]] == 0){
                    total--;
                }
            }
            res = Math.max(res,j-i+1);
        }
        return res;
    }
}
