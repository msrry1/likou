package com.algorithm.likou.p701_p800;

/**
 * @ClassName:p701_二叉搜索树中的插入操作
 * @Auther: Lyh
 * @Date: 2022/7/9 21:42
 * @Version: v1.0
 */
public class p701_二叉搜索树中的插入操作 {
    public void search(TreeNode root, int val){

        if(root.left == null && val < root.val){
            root.left = new TreeNode(val);
            return;
        }
        if(root.right == null && val > root.val){
            root.right = new TreeNode(val);
            return;
        }
        if(val > root.val){
            search(root.right, val);
        } else{
            search(root.left, val);
        }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        search(root, val);
        return root;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}