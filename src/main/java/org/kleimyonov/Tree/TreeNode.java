package Tree;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//public class TreeNode {
//
//    public static void main(String[] args) {
//      Tree root = new Tree(5,
//        new Tree(4,
//                new Tree(4), null),
//              new Tree(10,
//                      new Tree(2),
//                      new Tree(3,
//                              new Tree(15), null)));
//
//        System.out.println("-".repeat(100));
//
//        System.out.println(root.sum());
//    }
//
//    static class Tree {
//        int val;
//        Tree left;
//        Tree right;
//
//
//        public Tree(int val) {
//            this.val = val;
//        }
//
//        public Tree(int val, Tree left, Tree right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//
//        public  int sum() {
//            int summ = val;
//            if (left != null) {
//              summ *= left.sum();
//            }
//            if (right != null) {
//              summ *= right.sum();
//            }
//            return summ;
//       }
//   }
//}
