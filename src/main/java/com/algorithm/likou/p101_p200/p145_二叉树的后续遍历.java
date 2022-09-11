package com.algorithm.likou.p101_p200;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName:p145_二叉树的后续遍历
 * @Auther: Lyh
 * @Date: 2022/7/6 20:42
 * @Version: v1.0
 */
public class p145_二叉树的后续遍历 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        postorder(root, res);
        return res;
    }

    public void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
}
