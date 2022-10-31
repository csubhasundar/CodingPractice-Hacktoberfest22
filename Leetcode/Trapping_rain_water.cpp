#include<bits/stdc++.h>
using namespace std;

/* Hard problem of leet code : Trapping rain water in an easy way*/

class Solution {
public:
    int trap(vector<int>& height) {
        if(height.size() == 2 or height.size() == 1) return 0;
        int maxIndex = 0;
        for(int i=0;i<height.size();i++){
            if(height[i] > height[maxIndex])
                maxIndex = i;
        }
        
        int canBeStored = 0;
        int currentMax = height[0];
        for(int i=1;i<maxIndex;i++){
            if(height[i] > currentMax){
                currentMax = height[i];
            }
            else{
                canBeStored += (currentMax-height[i]);
            }
        }
        
        currentMax = height[height.size()-1];
        for(int i = height.size()-1;i>=maxIndex;i--){
            if(height[i] > currentMax)
                currentMax = height[i];
            else
                canBeStored += (currentMax-height[i]);
        }
        return canBeStored;
    }
};