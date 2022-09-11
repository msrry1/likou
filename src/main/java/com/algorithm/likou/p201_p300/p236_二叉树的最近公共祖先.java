package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p236_二叉树的最近公共祖先
 * @Auther: Lyh
 * @Date: 2022/7/28 15:20
 * @Version: v1.0
 */
public class p236_二叉树的最近公共祖先 {
    //如果一个在左子树一个在右子树，最近祖先root
    //如果其中一个在root，最近祖先root
    //如果两个都在左子树，则取root.left去找
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root.val == p.val || root.val == q.val){
            return root;
        }
        TreeNode s1 = lowestCommonAncestor(root.left, p, q);
        TreeNode s2 = lowestCommonAncestor(root.right, p, q);
        if(s1 != null && s2 != null){
            return root;
        }
        return s1 == null ? s2 : s1;
    }
}
