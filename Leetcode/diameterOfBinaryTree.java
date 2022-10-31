// ! Problem-Statement - https://leetcode.com/problems/diameter-of-binary-tree/
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int[] max=new int[1];
        f(root,max);
        return max[0];
    }
    int f(TreeNode root, int[] max){
        if(root==null) return 0;
        int l=f(root.left,max);
        int r=f(root.right,max);
        if(l+r>max[0]) max[0]=l+r;
        return 1+Math.max(l,r);
    }
}