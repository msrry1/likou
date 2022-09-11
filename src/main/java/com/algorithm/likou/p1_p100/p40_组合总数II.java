package com.algorithm.likou.p1_p100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName:p40_组合总数II
 * @Auther: Lyh
 * @Date: 2022/7/20 15:49
 * @Version: v1.0
 */
public class p40_组合总数II {
    List<List<Integer>> ret = new ArrayList();
    boolean[] vis;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n = candidates.length;
        List<Integer> road = new ArrayList();
        vis = new boolean[n];
        dfs(candidates, 0, 0, target, road);
        return ret;
    }
    public void dfs(int[] candidates, int now, int start, int target, List<Integer> road){
        if(now > target){
            return;
        }
        if(now == target){
            ret.add(new ArrayList(road));
            return;
        }
        for(int i = start;i < candidates.length;i++){
            if(i > 0 && candidates[i - 1] == candidates[i] && !vis[i-1]){
                continue;
            }
            if(now + candidates[i] <= target){
                road.add(candidates[i]);
                vis[i] = true;
                dfs(candidates, now + candidates[i], i+1, target, road);
                vis[i] = false;
                road.remove(road.size() - 1);
            }


        }
    }
}
