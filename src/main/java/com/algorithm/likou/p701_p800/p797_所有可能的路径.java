package com.algorithm.likou.p701_p800;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p797_所有可能的路径
 * @Auther: Lyh
 * @Date: 2022/7/18 17:06
 * @Version: v1.0
 */
public class p797_所有可能的路径 {
    List<List<Integer>> ret = new ArrayList();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        //每一条路径
        List<Integer> road = new ArrayList();
        //初始从 0 开始
        road.add(0);
        dfs(graph, road, 0, n-1);
        return ret;
    }

    public void dfs(int[][] graph, List<Integer> road, int x, int n){
        if(x == n){ //结束一次
            ret.add(new ArrayList(road));
            return;
        }
        for(int c : graph[x]){
            road.add(c);
            dfs(graph, road, c, n);
            road.remove(road.size()-1);
        }
    }
}
