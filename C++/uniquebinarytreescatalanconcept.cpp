/* This is the best way to count the number of unique binary search trees. This method of computation also has a name known as catalan number.*/


#include<bits/stdc++.h>
using namespace std;

class Solution {
    long long denominator(int n){
        if(n%2 == 0){
            n = n/2;
        }
        else
            n = (n+1)/2;
        long long answer = 1;
        for(int i=1;i<=n;i++){
            answer *= i;
        }
        return answer;
    }
    
    long long numerator(int n){
        int till = 2*n-1;
        if(n%2 == 0) n += 3;
        else n += 2;
        long long answer = 1;
        for(int i=n;i<=till;i+=2)
            answer *= i;
        int den_2 = (n+1)/2;
        return answer*pow(2, n - den_2-1);
    }
public:
    int numTrees(int n) {
        long long numeratorIs = numerator(n);
        long long denominatorIs = denominator(n);
        return numeratorIs/denominatorIs;
    }
};