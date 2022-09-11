package com.algorithm.likou.p701_p800;

/**
 * @ClassName:p733_图像渲染
 * @Auther: Lyh
 * @Date: 2022/7/3 10:54
 * @Version: v1.0
 */
public class p733_图像渲染 {
    int[][] ret;
    boolean[][] flag;

    public void dfs(int[][] image, int i, int j, int size,int color){
        if(i < 0 || i >= image.length || j < 0 || j >= image[0].length){
            return;
        }
        if(image[i][j] == size && flag[i][j] == false){
            ret[i][j] = color;
            flag[i][j] = true;
            dfs(image, i-1, j, size, color);
            dfs(image, i+1, j, size, color);
            dfs(image, i, j-1, size, color);
            dfs(image, i, j+1, size, color);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int size = image[sr][sc];
        ret = new int[image.length][image[0].length];
        flag = new boolean[image.length][image[0].length];
        for(int i = 0;i < image.length;i++){
            for(int j = 0;j < image[0].length;j++){
                ret[i][j] = image[i][j];
            }
        }
        dfs(image,sr,sc,size,color);
        return ret;
    }
}
