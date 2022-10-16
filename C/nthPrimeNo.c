#include<stdio.h>

int isPrime(int a){
	int i;
	for(i=2;i<=a/2;i++){
		if(a%i==0){
			return 0;
		}
	}
	return 1;
}

int main(){
	int i,n,count=0,nprime;
	
	printf("Finding the nth Prime number:\n");
	printf("Enter value of n: ");
	scanf("%d",&n);
	for(i=2;count!=n;i++){
		if(isPrime(i)){
			count++;
			nprime = i;
			printf("\t%d prime number is: %d\n", count, nprime);
		}
	}
	
	printf("\n%d th prime number is: %d\n",n,nprime);
	
	return 0;
}
