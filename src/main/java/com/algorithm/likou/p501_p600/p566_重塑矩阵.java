package com.algorithm.likou.p501_p600;

/**
 * @ClassName:p566_重塑矩阵
 * @Auther: Lyh
 * @Date: 2022/6/30 17:08
 * @Version: v1.0
 */
public class p566_重塑矩阵 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int lr = mat.length;
        int lc = mat[0].length;
        if(lr*lc != r*c){
            return mat;
        }
        int[] temp = new int[lr*lc];
        int p = 0;
        int[][] res = new int[r][c];
        for(int i = 0;i < lr;i++){
            for(int j = 0;j < lc;j++){
                temp[p++] = mat[i][j];
            }
        }
        p = 0;
        for(int i = 0;i < r;i++){
            for(int j = 0;j < c;j++){
                res[i][j] = temp[p++];
            }
        }
        return res;
    }
}
