#include<iostream>

using namespace std;

int strlen(char []);
int max(int a, int b);

int lcs( char *X, char *Y, int m, int n )
{
   if (m == 0 || n == 0)
     return 0;
   if ((X[m] == Y[n])&&(m>0&&n>0))
     return 1 + lcs(X, Y, m-1, n-1);
   else
     return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
}

int max(int a, int b)
{
    if(a>b)
    {
        return a;
    }
    else
    {
        return b;
    }
}

int strlen(char s[])
{
     int p;
     for(p=1; s[p]!='\0'; p++);
     return p;
}

int main()
{
  char X[] = "abcbdab";
  char Y[] = "bdcaba";

  int m = strlen(X);
  cout<<endl<<"Length of X[] is = "<<m<<endl;
  int n = strlen(Y);
  cout<<endl<<"Length of Y[] is = "<<n<<endl;

  cout<<endl<<"Length of LCS is = "<<lcs( X, Y, m, n )<<endl;
  return 0;
}
