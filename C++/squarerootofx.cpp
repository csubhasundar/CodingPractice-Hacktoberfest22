/* Square root of x although easy sum on leetcode only 37% acceptance*/

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int mySqrt(int x) {
        long temp = long(x);
        if(x<=5) temp = x+2;
        else temp = x;
        for(long i=1;i<=temp/2;i++){
            if(i*i == long(x)) return i;
            if(i*i > long(x)) return i-1;
        }
        return 0;
    }
};