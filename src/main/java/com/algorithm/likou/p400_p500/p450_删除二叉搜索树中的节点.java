package com.algorithm.likou.p400_p500;

/**
 * @ClassName:p450_删除二叉搜索树中的节点
 * @Auther: Lyh
 * @Date: 2022/7/26 17:12
 * @Version: v1.0
 */
public class p450_删除二叉搜索树中的节点 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if (root.val == key) {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            TreeNode t = root.right;
            while (t.left != null) t = t.left;
            t.left = root.left;
            return root.right;
        } else if (root.val < key) root.right = deleteNode(root.right, key);
        else root.left = deleteNode(root.left, key);
        return root;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode next;

    public TreeNode() {}

    public TreeNode(int _val) {
        val = _val;
    }

    public TreeNode(int _val, TreeNode _left, TreeNode _right, TreeNode _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
