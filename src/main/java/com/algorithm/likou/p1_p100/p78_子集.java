package com.algorithm.likou.p1_p100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p78_子集
 * @Auther: Lyh
 * @Date: 2022/7/19 18:17
 * @Version: v1.0
 */
public class p78_子集 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<Integer>());
        return res;

    }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        res.add(new ArrayList<>(tmp));
        for (int j = i; j < nums.length; j++) {
            tmp.add(nums[j]);
            backtrack(j + 1, nums, res, tmp);
            tmp.remove(tmp.size() - 1);
        }
    }
}
