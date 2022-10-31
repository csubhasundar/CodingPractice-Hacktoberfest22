// ! Problem - Statement - https://leetcode.com/problems/construct-string-from-binary-tree/

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
class Solution {
    
    public String tree2str(TreeNode t) {
       
        if (t == null) return "";
        String s = new String(t.val + "");
        if (t.left != null) s += "(" + tree2str(t.left) + ")";
        else if (t.right != null) s += "()";
        if (t.right != null) s += "(" + tree2str(t.right) + ")";
        return s;
            
    }
}