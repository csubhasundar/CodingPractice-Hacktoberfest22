class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> d;
        int s=0;
        d[0]=-1;
        
        for(int i=0 ; i<nums.size() ; i++){
            s += nums[i];
            
            if(k!=0) s %= k;
            
            if(d.find(s) != d.end())
            {
                if(i-d[s] > 1) return true;
            }
            else d[s]=i;         
        }
        return false;
    }
};
