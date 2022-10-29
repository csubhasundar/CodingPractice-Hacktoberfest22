#include <iostream>
using namespace std;
int main()
{
cout << "Enter the number of rows to show the star pattern:  ";
int n, x,  y,  s = 1, k;
cin >> n;
for(x = 0; x <= n; x++)
{
for(y = n; y > x; y--)
{
cout << " ";
}
cout << "*";
if (x > 0)
{
for(k = 1; k <= s;  k++)
{
cout << " ";
}
s += 2;
cout << "*";
}
cout << "\n";
}
s -= 4;
for(x = 0; x <= n -1; x++)
{
for(y = 0; y <= x; y++)
{
cout << " ";
}
cout << "*";
for(k = 1; k <= s; k++)
{
cout << " ";
}
s -= 2;
if(x != n -1)
{
cout << "*";
}
//ending line after each row
cout << "\n";
}
return 0;
}
