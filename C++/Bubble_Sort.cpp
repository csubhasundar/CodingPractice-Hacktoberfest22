#include <iostream>
using namespace std;
void bubblesort(int *a, int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = 0; j < n - 1 - i; j++)
        {
            if (a[j + 1] < a[j])
            {
                int t = a[j];
                a[j] = a[j + 1];
                a[j + 1] = t;
            }
        }
    }
}
int main()
{
    int n;
    cin >> n;
    int *a = new int[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    // Before Bubble Sort 
    for (int i = 0; i < n; i++)
    {
        cout << a[i] << " ";
    }
    cout<<endl;
    bubblesort(a, n);
    // After Bubble Sort
    for (int i = 0; i < n; i++)
    {
        cout << a[i] << " ";
    }
    delete[] a;
}
