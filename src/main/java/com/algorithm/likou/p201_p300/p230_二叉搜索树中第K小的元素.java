package com.algorithm.likou.p201_p300;

/**
 * @ClassName:p230_二叉搜索树中第K小的元素
 * @Auther: Lyh
 * @Date: 2022/6/8 17:43
 * @Version: v1.0
 */

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

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class p230_二叉搜索树中第K小的元素 {
    int target = 0; //查找元素的位置，为k
    int now = 0; //现在的位置
    int ans = 0; //返回答案
    public int kthSmallest(TreeNode root, int k) {
        target = k; //赋值给全局变量
        middle(root); //中序遍历
        return ans;
    }

    public void middle(TreeNode root){
        if(root == null){
            return;
        }
        middle(root.left);
        if(++now == target){ //此元素为第 k 小时设置返回答案
            ans = root.val;
        }

        middle(root.right);

    }
}
