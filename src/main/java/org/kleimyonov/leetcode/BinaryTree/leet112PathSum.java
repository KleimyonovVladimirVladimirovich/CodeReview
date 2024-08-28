package org.kleimyonov.leetcode.BinaryTree;

public class leet112PathSum {
    public static void main(String[] args) {
        Tree root = new Tree(8,
                new Tree(3,
                        new Tree(1),
                        new Tree(6,
                                new Tree(4),
                                new Tree(7))),
                new Tree(10, null,
                        new Tree(14, new Tree(13), null)));
        System.out.println(root.hasPathSum(root, 17));
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(root.hasPathSum(root, i));
//        }
       // System.out.println(root.sum());
    }

    static class Tree {
        int val;
        Tree left;
        Tree right;
        public Tree(int val) {
            this.val = val;
        }

        public Tree(int val, Tree left, Tree right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
        public Tree(){}

        public int sum() {
            int summm = val;
            if (left != null) {
                summm += left.sum();
            }
            if (right != null) {
                summm += right.sum();
            }
            return summm;
        }

        public boolean hasPathSum(Tree root, int targetSum) {
            if (root == null) {
                return false;
            }
            if (root.left == null && root.right == null) {
                return targetSum == root.val;
            }
            return hasPathSum(root.left, targetSum - root.val)
                    || hasPathSum(root.right, targetSum - root.val);
        }
    }

}
