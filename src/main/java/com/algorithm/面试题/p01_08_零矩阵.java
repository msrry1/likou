package com.algorithm.面试题;

/**
 * @ClassName:p01_08_零矩阵
 * @Auther: Lyh
 * @Date: 2022/9/30 23:15
 * @Version: v1.0
 */
public class p01_08_零矩阵 {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean [] r = new boolean[m];
        boolean [] c = new boolean[n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(matrix[i][j] == 0){
                    r[i] = c[j] = true;
                }
            }
        }
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(r[i] || c[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
