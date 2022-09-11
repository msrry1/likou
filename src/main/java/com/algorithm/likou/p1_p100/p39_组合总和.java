package com.algorithm.likou.p1_p100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName:p39_组合总和
 * @Auther: Lyh
 * @Date: 2022/7/20 15:34
 * @Version: v1.0
 */
public class p39_组合总和 {
    List<List<Integer>> ret = new ArrayList();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n = candidates.length;
        List<Integer> road = new ArrayList();
        dfs(candidates, 0, 0, target, road);
        return ret;
    }
    public void dfs(int[] candidates, int now, int start, int target, List<Integer> road){
        if(now == target){
            ret.add(new ArrayList(road));
            return;
        }
        for(int i = start;i < candidates.length;i++){
            if(now + candidates[i] <= target){
                road.add(candidates[i]);
                dfs(candidates, now + candidates[i], i, target, road);
                road.remove(road.size() - 1);
            } else{
                break;
            }

        }
    }
}
