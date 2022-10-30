#include<bits/stdc++.h>
using namespace std;
//using hashing
//insert all the elements in hash table from array1

int intersection(int a[],int b[],int m ,int n){
    unordered_set<int> s;
    for(int i=0;i<m;i++){
        s.insert(a[i]);
    }
    int res=0;
    for(int j =0;j<n;j++){
        if(s.find(b[j])!=s.end()){
            res++;
            s.erase(b[j]);
        }
    }
    return res;

}
int main(){
    int m , n;
    cin>>m>>n;
    int a[m];
    int b[n];
    for(int i =0;i<n;i++){
        cin>>a[i];
    }
    for(int j =0;j<m;j++){
        cin>>b[j];
    }
    cout<<intersection(a,b,m,n);
    return 0;
}
