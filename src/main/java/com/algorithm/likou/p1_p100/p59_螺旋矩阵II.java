package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p59_螺旋矩阵II
 * @Auther: Lyh
 * @Date: 2022/7/13 15:23
 * @Version: v1.0
 */
public class p59_螺旋矩阵II {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int[][] matrix = new int[n][n];
        int left = 0, right = n - 1, top = 0, bottom = n - 1;
        while (left <= right && top <= bottom) {
            //向右
            for (int column = left; column <= right; column++) {
                matrix[top][column] = num;
                num++;
            }
            //向下
            for (int row = top + 1; row <= bottom; row++) {
                matrix[row][right] = num;
                num++;
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    matrix[bottom][column] = num;
                    num++;
                }
                for (int row = bottom; row > top; row--) {
                    matrix[row][left] = num;
                    num++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return matrix;
    }
}
