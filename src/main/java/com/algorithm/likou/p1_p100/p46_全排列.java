package com.algorithm.likou.p1_p100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p46_全排列
 * @Auther: Lyh
 * @Date: 2022/7/9 00:20
 * @Version: v1.0
 */
public class p46_全排列 {
    List<List<Integer>> ret = new ArrayList();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> temp = new ArrayList(nums.length);
        dfs(nums, 0, nums.length, temp);
        return ret;
    }

    public void dfs(int[] nums, int length, int sum, List<Integer> temp){
        //递归终止条件
        if(length == sum){
            ret.add(new ArrayList(temp));
            return;
        }
        for(int i = 0;i < sum;i++){
            if(!temp.contains(nums[i])){
                temp.add(nums[i]);
                dfs(nums, length+1, sum, temp);
                temp.remove(temp.size()-1);
            }
        }

    }
}
