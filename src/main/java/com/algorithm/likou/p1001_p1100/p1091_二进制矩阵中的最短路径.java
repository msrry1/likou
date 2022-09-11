package com.algorithm.likou.p1001_p1100;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName:p1091_二进制矩阵中的最短路径
 * @Auther: Lyh
 * @Date: 2022/7/18 16:37
 * @Version: v1.0
 */
public class p1091_二进制矩阵中的最短路径 {
    int[] dx = new int[]{0,1,1,1,0,-1,-1,-1};//行变化量
    int[] dy = new int[]{1,1,0,-1,-1,-1,0,1};//列变换量
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;//行数
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;//如果左顶点或右下角为1，则直接返回-1
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 1});//如果左顶点不为1，就将其加到队列中，将步数存在数组的第三个位置
        grid[0][0] = 1;
        while(!q.isEmpty()){//进行波纹式扩散
            int[] temp1 = q.poll();
            if(temp1[0] == n-1 && temp1[1] == n-1){//如果该点就是终点，就返回结果
                return temp1[2];
            }
            for(int t = 0;t < 8;t++){//进行四周扩散
                int x = temp1[0]+dx[t];
                int y = temp1[1]+dy[t];
                if(x >= 0 && x < n && y >= 0 && y < n && grid[x][y] == 0){
                    q.offer(new int[]{x,y,temp1[2]+1});//如果扩散到达的点的值为0，步数就再+1
                    grid[x][y] = 1;
                }
            }
        }
        return -1;//如果没有到达终点，就返回-1；
    }
}
