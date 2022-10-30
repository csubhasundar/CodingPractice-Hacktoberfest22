#include<iostream>
using namespace std;
int main()
{
    int i, j;
    for(i=0; i<6; i++)
    {
        for(j=i; j<6; j++)
            cout<<"* ";
        cout<<endl;
    }
    cout<<endl;
    return 0;
}
