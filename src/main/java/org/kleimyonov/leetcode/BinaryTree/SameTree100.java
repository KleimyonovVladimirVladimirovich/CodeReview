package org.kleimyonov.leetcode.BinaryTree;

public class SameTree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
         if (p == null && q == null) {
             return false;
         }
         if (p != null && q != null && p.val == q.val) {
             return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
         }
         return true;
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
      //   ПРОВЕРКА
//    public static void main(String[] args) {
//        TreeNode p = new TreeNode(1);
//        TreeNode q = new TreeNode(1);
//        SameTree100 sameTree100 = new SameTree100();
//        System.out.println(sameTree100.isSameTree(p, q));
//    }
}
