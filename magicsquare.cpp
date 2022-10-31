#include<stdio.h>
#include<conio.h>

int main()
{

 int i,j,n,num,a[100][100];
// clrscr();
 printf ("enter any odd no.:");
 scanf("%d",&n );
 i=n-1;
 j=(n-1)/2;
  if(n%2==0)
  {  printf(" enter only odd no.");}

  else
  {

   for(num=1;num<=n*n;num++)
 {
  a[i][j]=num;
  i++;
  j--;
  if(num%n==0)
    {i-=2;
     j++;
    }

  if(i==n)
    i=0;
  if(j==-1)
    j=n-1;


 }

 for(i=0;i<n;i++)
  { for(j=0;j<n;j++)
    printf("%4d ",a[i][j]);
    printf("\n");
  }
   }
 getch();
}
