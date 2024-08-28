package org.kleimyonov.leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

//
//          <inorder - обход значений его узлов в симметричном порядке
//

public class inorderTraversal94 {
    public static void main(String[] args) {

     TreeNode root = new TreeNode(1, null,
             new TreeNode(2, new TreeNode(3), null));
        System.out.println(root.inorderTraversal(root));
    }
    //Input: root = [1,2,3]
    //Output: [1,3,2]
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            helper(root, res);
            return res;
        }

        public void helper(TreeNode root, List<Integer> res) {
            if (root != null) {
                helper(root.left, res);
                res.add(root.val);
                helper(root.right, res);
            }
        }
    }
}