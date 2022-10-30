#include <bits/stdc++.h>
using namespace std;

void countFreq(int arr[], int n)
{
    unordered_map<int, int> mp;

    for(int i = 0;i<n;i++){
        mp[arr[i]]++;

    }
    for(auto x : mp){
        cout<<x.first<<" "<<x.second<<endl;
    }
}

int main()
{
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    countFreq(arr, n);

    return 0;
}
