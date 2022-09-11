package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p74_搜索二维矩阵
 * @Auther: Lyh
 * @Date: 2022/7/11 12:49
 * @Version: v1.0
 */
public class p74_搜索二维矩阵 {
    public boolean search(int[][] matrix, int target, int m){
        int left = 0;
        int right = matrix[0].length-1;
        int mid = left + (right-left)/2;
        while(left <= right){
            mid = left + (right-left)/2;
            if(matrix[m][mid] == target){
                return true;
            }
            if(target > matrix[m][mid]){
                left = mid+1;
            }
            if(target < matrix[m][mid]){
                right = mid-1;
            }
        }
        return false;
    }


    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0;i < m;i++){
            if(target >= matrix[i][0] && target <= matrix[i][n-1]){
                return search(matrix, target, i);
            }
        }
        return false;
    }
}
