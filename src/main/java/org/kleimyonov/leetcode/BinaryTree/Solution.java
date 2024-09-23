package org.kleimyonov.leetcode.BinaryTree;

class Solution {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        System.out.println(root.maxDepth(root));
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(){}
        public TreeNode(int val){
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
//        public int maxDepth(TreeNode root) {
//         int count = val;
//         int c = 0;
//         if (left != null) {
//             count++;
//             c++;
//         }
//         if (right != null) {
//             count++;
//             c++;
//         }
//         return count;
//        }


       public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            }
           return Math.max(maxDepth(root.left), maxDepth(root.right)) +1;
       }
    }
}

