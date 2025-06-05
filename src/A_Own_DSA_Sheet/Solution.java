//package A_Own_DSA_Sheet;
//
//import Tree.TreeNode;
//import java.util.PriorityQueue;
//
//public class Solution {
//
//    public int KthSmallest(TreeNode root, int k){
//        PriorityQueue<Integer> minheap = new PriorityQueue<>();
//
//        //helper method creating and calling
//        helper(root, minheap, k);
//
//        //remove elements
//        int ans = 0;
//        for (int i=0; i<k; i++){
//            ans = minheap.poll();
//        }
//        return ans;
//
//    }
//    private void helper(TreeNode node, PriorityQueue<Integer> minheap, int k){
//        if (node == null){
//            return;
//        }
//
//        //inOrder Traveling ---left--root--right---
//        helper(node.left, minheap, k);
//
//
//
//        helper(node.right, minheap, k);
//
//    }
//
//
//    private int k ;
//    private int ans;
//    public int kthSmallest(TreeNode root, int k){
//        this.k = k;
//        helper(root);
//        return ans;
//
//    }
//    private void helper(TreeNode node){
//        if (node == null){
//            return;
//        }
//
//        helper(node.left);
//
//       k--;
//       if (k == 0 ){
//           ans = node.val;
//           return;;
//       }
//
//
//
//        helper(node.right);
//
//    }
//}
