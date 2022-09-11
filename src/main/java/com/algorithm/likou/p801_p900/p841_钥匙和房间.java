package com.algorithm.likou.p801_p900;

import java.util.List;

/**
 * @ClassName:p841_钥匙和房间
 * @Auther: Lyh
 * @Date: 2022/7/29 14:39
 * @Version: v1.0
 */
public class p841_钥匙和房间 {
    boolean[] vis;
    int num;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        num = 0;
        vis = new boolean[n];
        dfs(rooms, 0);
        return num == n;
    }

    public void dfs(List<List<Integer>> rooms, int x) {
        vis[x] = true;
        num++;
        for (int it : rooms.get(x)) {
            if (!vis[it]) {
                dfs(rooms, it);
            }
        }
    }
}
