package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p226_翻转二叉树
 * @Auther: Lyh
 * @Date: 2022/7/8 22:46
 * @Version: v1.0
 */
public class p226_翻转二叉树 {
    //递归交换每个节点的左右孩子
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
