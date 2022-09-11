package com.algorithm.likou.p101_p200;

/**
 * @ClassName:p112_路径总和
 * @Auther: Lyh
 * @Date: 2022/7/8 22:36
 * @Version: v1.0
 */
public class p112_路径总和 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            return false;
        }
        if(root.val == targetSum && root.left == null && root.right == null){
            return true;
        }
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
