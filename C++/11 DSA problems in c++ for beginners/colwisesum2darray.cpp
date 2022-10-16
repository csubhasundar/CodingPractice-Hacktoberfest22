#include <iostream>
using namespace std;

void printsum(int arr[][3], int row, int col)
{
    for(col = 0; col < 3; col++)
    {
        int sum = 0;
        for(int row = 0; row < 3; row++)
        {
            sum += arr[row][col];
        }
        cout << sum << " ";
    }
    cout << endl;
}

bool isPresent(int arr[][3], int target, int row, int col)
{
    for(row = 0; row < 3; row++)
    {
        for(col = 0; col < 3; col++)
        {
            if(arr[row][col] == target)
                return 1;
        }
    }
    return 0;
}

int main()
{
    int target;
    int arr[3][3];

    // taking row wise input
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cin >> arr[i][j];
        }
    }

    // output
    for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }


    cout << "Enter element to search " << endl;
    cin >> target;

    if (isPresent(arr, target, 3, 3))
        cout << "Element found";
    else
        cout << "Element not found";
        
    cout << endl;
    printsum(arr,3,3);
    return 0;
}