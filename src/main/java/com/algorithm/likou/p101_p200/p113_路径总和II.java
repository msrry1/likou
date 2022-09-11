package com.algorithm.likou.p101_p200;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName:p113_路径总和II
 * @Auther: Lyh
 * @Date: 2022/7/26 16:52
 * @Version: v1.0
 */
public class p113_路径总和II {
    List<List<Integer>> ret = new LinkedList<List<Integer>>();
    Deque<Integer> path = new LinkedList<Integer>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return ret;
    }

    public void dfs(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0) {
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        path.pollLast();
    }
}
