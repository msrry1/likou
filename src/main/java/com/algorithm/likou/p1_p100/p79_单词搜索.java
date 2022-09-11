package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p79_单词搜索
 * @Auther: Lyh
 * @Date: 2022/7/21 14:50
 * @Version: v1.0
 */
public class p79_单词搜索 {
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        visited = new boolean[m][n];
        char first = word.charAt(0);
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                if(board[i][j] == first){
                    visited[i][j] = true;
                    boolean flag = dfs(word, i + 1, j, 1, board) || dfs(word, i -1 ,j, 1, board) || dfs(word, i, j-1, 1, board) || dfs(word, i, j+1, 1, board);
                    if(flag == true){
                        return true;
                    }
                    visited[i][j] = false;
                }
            }
        }
        return false;
    }
    public boolean dfs(String word, int i, int j, int index, char[][] board){
        if(index == word.length()){
            return true;
        }
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index) || visited[i][j] == true){
            return false;
        }
        visited[i][j] = true;
        boolean flag = dfs(word, i +1,j,index+1,board) ||
                dfs(word, i - 1, j, index+1, board) ||
                dfs(word, i, j+1,index +1,board) ||
                dfs(word, i, j-1, index +1 , board);
        visited[i][j] = false;
        return flag;
    }
}
