#include <bits/stdc++.h>
#include <set>
using namespace std;

void setDemo()
{
    set<int> S;
    S.insert(1);
    S.insert(2);
    S.insert(6);
    S.insert(-1);
    S.insert(-7);

    for (int x : S)
    {
        cout << x << " ";
    }
    cout << endl;

    // - 7 -1 1 2 6
    auto it = S.find(-7);
    if (it == S.end())
    {
        cout << "Not present \n";
    }
    else
    {
        cout << "Present :" << *it << endl;
    }

    auto it2 = S.upper_bound(-1);
    auto it3 = S.upper_bound(0);
    cout << *it2 << " " << *it3 << endl;

    auto it4 = S.upper_bound(90);
    if (it4 == S.end())
    {
        cout << "oops! Sorry can't find anything here  " << endl;
    }
    
}
int main()
{
    setDemo();
}