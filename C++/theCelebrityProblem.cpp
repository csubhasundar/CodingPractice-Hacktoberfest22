/*A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
Note: Follow 0 based indexing.
Follow Up: Can you optimize it to O(N)*/


#include<bits/stdc++.h>
using namespace  std ;
bool knows(vector<vector<int> >& M,int a ,int b){
        return M[a][b];
}
int celebrity(vector<vector<int> >& M, int n) 
    {
        // code here 
        stack<int> st ;
        for(int i=0 ;i<n;i++){
            st.push(i);
        }
        //next step 
        while(st.size()>1){
            int a = st.top();
            st.pop();
            int b = st.top();
            st.pop();
            if(knows(M,a,b)){
                st.push(b);
            }else{
                st.push(a);
            }

        }
        int C= st.top();
            st.pop();
        for (int i = 0; i < n; i++)
         {

            if ( (i != C) &&
                    (knows(M,C, i) ||
                     !knows(M,i, C)) )
                return -1;


        }
        return C;
    }




int main(){
    int n ;
    cin>> n;
    vector<vector<int> >  M(n ,vector<int>(n,0));
    for(int i=0 ;i<n;i++){
        for(int j=0 ;j<n;j++){
            cin>>M[i][j];
        }
    }
    int result = celebrity(M,n);
    cout<<result<<endl;
    return 0 ;
}