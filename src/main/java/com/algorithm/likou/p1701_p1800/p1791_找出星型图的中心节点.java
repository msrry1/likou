package com.algorithm.likou.p1701_p1800;

/**
 * @ClassName:p1791_找出星型图的中心节点
 * @Auther: Lyh
 * @Date: 2022/9/29 18:25
 * @Version: v1.0
 */
public class p1791_找出星型图的中心节点 {
    public int findCenter(int[][] edges) {
        int a1 = edges[0][0];
        int a2 = edges[0][1];
        int b1 = edges[1][0];
        int b2 = edges[1][1];
        if(a1 == b1 || a1 == b2){
            return a1;
        }
        return a2;
    }
}
