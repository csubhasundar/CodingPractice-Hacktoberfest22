package Leetcode;

/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.


Example 1:


Input: root = [2,1,3]
Output: true
Example 2:


Input: root = [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
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

public class Validate_Binary_Search_Tree {
    public boolean isValidBST(TreeNode root) {
        return Validate(root,null,null);

    }
    public boolean Validate(TreeNode root,Integer low,Integer high){
        if(root==null)
            return true;
        if( high!=null && root.val<=high){
            return false;
        }
        if( low!=null && root.val>=low){
            return false;
        }
        return Validate(root.left,root.val,high) && Validate(root.right,low,root.val);
    }
    public static void main(String[] args) {

    }
}
