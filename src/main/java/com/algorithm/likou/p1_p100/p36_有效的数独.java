package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p36_有效的数独
 * @Auther: Lyh
 * @Date: 2022/7/1 20:53
 * @Version: v1.0
 */
public class p36_有效的数独 {
    public boolean row(char[][] board, int i,int j){
        char target = board[i][j];
        for(int k = 0;k < board[0].length;k++){
            if(k != j){
                if(board[i][k] == target){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean col(char[][] board, int i,int j){
        char target = board[i][j];
        for(int k = 0;k < board.length;k++){
            if(k != i){
                if(board[k][j] == target){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean gong(char[][] board, int i, int j){
        char target = board[i][j];
        //计算每片区域的左上角位置
        int m1 = i/3*3;
        int n1 = j/3*3;

        for(int m = m1;m <=m1+2;m++){
            for(int n = n1;n <= n1+2;n++){
                if(m!=i && n!= j){
                    if(board[m][n] == target){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(board[i][j] != '.'){
                    if(!row(board, i, j) || !col(board, i, j) || !gong(board, i, j)){                return false;

                    }
                }

            }
        }
        return true;
    }
}
