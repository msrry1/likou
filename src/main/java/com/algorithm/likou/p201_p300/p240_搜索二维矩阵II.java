package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p240_搜索二维矩阵II
 * @Auther: Lyh
 * @Date: 2022/7/14 16:23
 * @Version: v1.0
 */
public class p240_搜索二维矩阵II {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        //从右上角开始查找
        //如果target > 当前值，向下查找
        //如果target < 当前值，向左查找
        //如果target == 当前值，返回
        int x = 0, y = n - 1;
        while (x < m && y >= 0) {
            if (matrix[x][y] == target) {
                return true;
            }
            if (matrix[x][y] > target) {
                --y;
            } else {
                ++x;
            }
        }
        return false;
    }
}
