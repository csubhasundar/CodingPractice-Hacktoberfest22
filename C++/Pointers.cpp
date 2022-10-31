#include <bits/stdc++.h>
using namespace std;
int main()
{
    // Type of declaration
    int *ptrVar;
    int *ptr;
    int *ptr2, p;
    int var = 5;
    ptrVar = &var;
    // Get value from address using pointer
    cout << *ptrVar << endl; // Output:5

    // Working on pointers
    cout<<"Var : "<<var<<endl;
    cout<<"Address of var (&var) : "<<&var<<endl;
    cout<<"PtrVar : "<<ptrVar<<endl;
    cout<<"Value or content of the PtrVar (*ptrVar) : "<<*ptrVar<<endl;

    cout<<"======================================"<<endl;
    cout<<"Changing the -value of the pointer"<<endl;
    int var2 = 10;
    ptr = &var2;
    cout<<"Value of ptr "<<*ptr<<" and var2 "<<var2<< " Before changing "<<endl;
    *ptr = 20;
    cout<<"After changing the value of var2 using ptr is : "<<var2<<endl;

    cout<<"Here is how we can work with the pointer in c++ "<<endl;

    return 0;
}