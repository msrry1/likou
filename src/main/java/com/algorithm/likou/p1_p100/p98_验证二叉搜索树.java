package com.algorithm.likou.p1_p100;

/**
 * @ClassName:p98_验证二叉搜索树
 * @Auther: Lyh
 * @Date: 2022/7/10 13:01
 * @Version: v1.0
 */
public class p98_验证二叉搜索树 {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    //每次判断node的值在不在[lower, upper]之间，不在就直接返回false
    public boolean isValidBST(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        if (node.val <= lower || node.val >= upper) {
            return false;
        }
        return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
    }
}
