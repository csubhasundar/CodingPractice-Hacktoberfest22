#include<iostream>
using namespace std;
int main()
{
	int n;
	cout<<"ENTER THE SIZE OF ARRAY ";
	cin>>n;
	int a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
			
	}cout<<"\n";
	
	int maxSum=INT_MIN;
    for(int i=0;i<n;i++)
	{
		int sum=0;
		sum+=a[i];
		if(sum<0)
		{
			sum=0;
		}maxSum=max(maxSum,sum);	
	}cout<<maxSum<<" ";
	cout<<"\n";
    
    
    
}
