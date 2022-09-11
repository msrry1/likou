package com.algorithm.likou.p901_p1000;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p986_区间列表的交集
 * @Auther: Lyh
 * @Date: 2022/7/14 17:06
 * @Version: v1.0
 */
public class p986_区间列表的交集 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ret = new ArrayList();
        int i = 0,j = 0;
        int m = firstList.length;
        int n = secondList.length;
        while(i < m && j < n){
            int l = Math.max(firstList[i][0], secondList[j][0]);
            int r = Math.min(firstList[i][1], secondList[j][1]);
            if(l <= r){
                ret.add(new int[] {l, r});
            }
            if(firstList[i][1] >= secondList[j][1]){
                j++;
            } else{
                i++;
            }
        }
        return ret.toArray(new int[ret.size()][]);
    }
}
