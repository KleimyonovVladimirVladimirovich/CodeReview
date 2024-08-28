package org.kleimyonov.leetcode.BinaryTree;

import java.util.LinkedList;
import java.util.List;

//
//       <-------- preorder - обратный обход дерева
//

public class postorderTraversal145 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5, new TreeNode(2), new TreeNode(4));

        System.out.println(TreeNode.postorderTraversal(root));
    }
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

        //Меняются местами лишь right <-> left
        //output.addFirst() <-
        public static List<Integer> postorderTraversal(TreeNode root) {
            LinkedList<TreeNode> stack = new LinkedList<>();
            List<Integer> output = new LinkedList<>();
            if (root == null) {
                return output;
            }
            stack.push(root);
            while(!stack.isEmpty()) {
                TreeNode node = stack.pop();
                output.addFirst(node.val);
                if (node.left != null) {
                    stack.push(node.left);
                }
                if (node.right != null) {
                    stack.push(node.right);
                }
            }
            return output;
        }
    }
}
