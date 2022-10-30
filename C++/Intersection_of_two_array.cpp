// intersectionOftwoArr.cpp
#include <bits/stdc++.h>
using namespace std;

//naive
int intersecction(int a[], int b[], int m, int n)
{
    int res = 0;
    for (int i = 0; i < m; i++)
    {
        bool flag = false;
        for (int j = 0; j < i - 1; j++)
        {
            if (a[j] == a[i])
            {
                flag = true;
                break;
            }
        }
        if (flag == true)
        {
            continue;
        }
        for (int j = 0; j < n; j++)
        {
            if (a[i] == b[j])
            {
                res++;
                break;
            }
        }
    }
    return res;
}

int main()
{
    int m, n;
    cin >> m >> n;
    int a[m];
    int b[n];
    for (int i = 0; i < m; i++)
    {
        cin >> a[i];
    }
    for (int j = 0; j < n; j++)
    {
        cin >> b[j];
    }
    cout << intersecction(a, b, m, n);
}
