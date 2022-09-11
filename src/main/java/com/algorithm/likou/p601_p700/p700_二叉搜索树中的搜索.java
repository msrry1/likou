package com.algorithm.likou.p601_p700;

/**
 * @ClassName:p700_二叉搜索树中的搜索
 * @Auther: Lyh
 * @Date: 2022/7/9 21:33
 * @Version: v1.0
 */
public class p700_二叉搜索树中的搜索{
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        if(root.val == val){
            return root;
        }
        if(val > root.val){
            return searchBST(root.right, val);
        } else{
            return searchBST(root.left, val);
        }
    }

}
