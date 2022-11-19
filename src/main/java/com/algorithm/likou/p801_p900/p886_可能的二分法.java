package com.algorithm.likou.p801_p900;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p886_可能的二分法
 * @Auther: Lyh
 * @Date: 2022/10/16 17:40
 * @Version: v1.0
 */
public class p886_可能的二分法 {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] color = new int[n + 1];
        //保存每个人不喜欢的人
        List<Integer>[] g = new List[n + 1];
        for (int i = 0; i <= n; ++i) {
            g[i] = new ArrayList<Integer>();
        }
        for (int[] p : dislikes) {
            g[p[0]].add(p[1]);
            g[p[1]].add(p[0]);
        }
        for (int i = 1; i <= n; ++i) {
            //如果没染色而且染色之后失败
            if (color[i] == 0 && !dfs(i, 1, color, g)) {
                return false;
            }
        }
        return true;
    }

    public boolean dfs(int curnode, int nowcolor, int[] color, List<Integer>[] g) {
        //先染色
        color[curnode] = nowcolor;
        //遍历所有该人不喜欢的人
        for (int nextnode : g[curnode]) {
            //如果那个人染色了而且和我一个色就失败
            if (color[nextnode] != 0 && color[nextnode] == color[curnode]) {
                return false;
            }
            //如果那个人没染色而且染色之后失败
            if (color[nextnode] == 0 && !dfs(nextnode, 3 ^ nowcolor, color, g)) {
                return false;
            }
        }
        return true;
    }
}
