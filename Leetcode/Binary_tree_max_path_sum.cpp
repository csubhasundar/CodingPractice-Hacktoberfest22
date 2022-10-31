#include<bits/stdc++.h>
using namespace std;
/* Max path sum difficult leetcode sum in most easy way*/

 // Definition for a binary tree node.
  struct TreeNode{
      int val;
      TreeNode *left;
      TreeNode *right;
      TreeNode() : val(0), left(nullptr), right(nullptr) {}
      TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
  };
 
class Solution {
    int answer = INT_MIN;
    int solve(TreeNode* root){
        if(!root) return 0;
        int a = solve(root->left);
        int b = solve(root->right);
        
        answer = max({(a+b+root->val), (a+root->val), (b+root->val), (root->val), answer});
        
        return max({(a+root->val), (b+root->val), root->val});
    }
public:
    int maxPathSum(TreeNode* root) {
        if(root == NULL) return 0;
        int a = solve(root);
        return int(answer);
    }
};