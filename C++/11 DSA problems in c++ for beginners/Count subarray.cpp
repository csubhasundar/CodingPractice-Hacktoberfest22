int numberOfSubarrays(int n, vector<int> arr)
{
    // Write your code here.
    int count = 0;
    for(int i = 0; i < n-1; i++)
    {
        if(arr[i] == 0)
        {
            if(arr[i+1] == 1)
                count++;
        }
        else
        {
            if(arr[i+1]==0)
                count++;
        }
    }
    return count;
} 
