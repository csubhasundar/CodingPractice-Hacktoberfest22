#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin>>n;
    int mat[n][n];
    int m=n*n;
    int a[m];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cin>>mat[i][j];
            
        }
    }
    int x=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            a[x++]=mat[i][j];
            
        }
    }
    int p=m/2;
    sort(a,a+m);
    cout<<"Median of the element:"<<a[p];
}
