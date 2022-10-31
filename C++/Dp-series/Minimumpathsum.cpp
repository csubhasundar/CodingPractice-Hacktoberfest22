#include<bits/stdc++.h>
using namespace std;
int helper(int i, int j,vector<vector<int>> &matrix,vector<vector<int>> &dp)
{
  if(i==0 && j == 0)
    return matrix[0][0];
  if(i<0 || j<0)
    return 1e9;
  if(dp[i][j]!=-1) return dp[i][j];
    
  int up = matrix[i][j]+helper(i-1,j,matrix,dp);
  int left = matrix[i][j]+helper(i,j-1,matrix,dp);
  
  return dp[i][j] = min(up,left);
  
}

int minPathSum(vector<vector<int> > &matrix){
    int n=matrix.size();
    int m=matrix[0].size();
    vector<vector<int> > dp(n,vector<int>(m,-1));
    return helper(n-1,m-1,matrix,dp);
    
}    
int main(int argc,char **argv)
{
  vector<vector<int>> matrix={{1,3,1},{1,5,1},{4,2,1}};
  minPathSum(matrix);
    return 0;
}