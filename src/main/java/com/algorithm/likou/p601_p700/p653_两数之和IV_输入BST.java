package com.algorithm.likou.p601_p700;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName:p653_两数之和IV_输入BST
 * @Auther: Lyh
 * @Date: 2022/7/10 14:26
 * @Version: v1.0
 */
public class p653_两数之和IV_输入BST {
    Set<Integer> set = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) return false;
        if (set.contains(k - root.val)) return true;
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }
}
