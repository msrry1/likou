package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p73_矩阵置零
 * @Auther: Lyh
 * @Date: 2022/7/1 13:43
 * @Version: v1.0
 */
public class p73_矩阵置零 {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        //标识第i行或第i列是否有0
        boolean[] hasRow = new boolean[row];
        boolean[] hasCol = new boolean[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    hasRow[i] = hasCol[j] = true;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (hasRow[i] || hasCol[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
