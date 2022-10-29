/*Problem Link- https://practice.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1

Problem Statement- 
  You are given weights and values of N items, put these items in a knapsack of capacity W to get the maximum total
  value in the knapsack. Note that we have only one quantity of each item.
In other words, given two integer arrays val[0..N-1] and wt[0..N-1] which represent values and weights associated with 
N items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of 
val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the
complete item or dont pick it (0-1 property).

Example 1:

Input:
N = 3
W = 4
values[] = {1,2,3}
weight[] = {4,5,1}
Output: 3
*/

#include<bits/stdc++.h>
using namespace std;

class Solution
{
    public:
    int helper(int ind,int W,int wt[],int val[],int n,vector<vector<int>> &dp){
        if(ind==n){return 0;}
        if(dp[W][ind]!=-1){return dp[W][ind];}
        int res=INT_MIN;
        if(wt[ind]<=W){
            res=max(res,val[ind]+helper(ind+1,W-wt[ind],wt,val,n,dp));
        }
        res=max(res,helper(ind+1,W,wt,val,n,dp));
        dp[W][ind]=res;
        return res;
    }
    //Function to return max value that can be put in knapsack of capacity W.
    int knapSack(int W, int wt[], int val[], int n) 
    { 
       vector<vector<int>> dp(W+1,vector<int>(n+1,-1));
       return helper(0,W,wt,val,n,dp);
    }
};


int main()
 {
    //taking total testcases
    int t;
    cin>>t;
    while(t--)
    {
        //reading number of elements and weight
        int n, w;
        cin>>n>>w;

        int val[n];
        int wt[n];

        //inserting the values
        for(int i=0;i<n;i++)
            cin>>val[i];

        //inserting the weights
        for(int i=0;i<n;i++)
            cin>>wt[i];
        Solution ob;
        //calling method knapSack()
        cout<<ob.knapSack(w, wt, val, n)<<endl;

    }
	return 0;
}
