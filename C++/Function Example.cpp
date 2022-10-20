#include<iostream>
using namespace std;
int stock_profit(int, int, int, int, int);
int stock_profit(int NS, int SP, int SC, int PP, int PC)
{
	int profit;
	profit = ((NS * SP) - SC) - ((NS * PP) + PC);
	return profit;
}


int main()
{
	int NS, SP, SC, PP, PC;
	//  NS Number of shares
	// 	PP Purchase price per share
	//	PC Purchase commission paid
	//	SP Sale price per share
	//	SC Sale commission paid

	cout << "Enter the number of shares:";
	cin >> NS;
	cout << "Enter the sale price per share:";
	cin >> SP;
	cout << "Enter the sale commision paid:";
	cin >> SC;
	cout << "Enter purchase price per share:";
	cin >> PP;
	cout << "Enter purchase commision paid:";
	cin >> PC;
	if (stock_profit(NS, SP, SC, PP, PC) < 0)
	{
		cout << stock_profit(NS, SP, SC, PP, PC) << "  is the loss value";
	}
	else
		cout << stock_profit(NS, SP, SC, PP, PC) << "  is the profit value";
}