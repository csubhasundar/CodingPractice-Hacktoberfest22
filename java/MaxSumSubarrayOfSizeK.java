//https://practice.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
/*
Max Sum Subarray of size K

Given an array of integers Arr of size N and a number K.
Return the maximum sum of a subarray of size K.
 */
class MaxSumSubarrayOfSizeK{

    /*
    Time complexity - o(n)
    Space complexity - o(1)
     */
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        int l=0;
        int r=0;
        long max=0;
        long sum=0;

        while(r < N){
            sum+= Arr.get(r);

            if(r-l+1 < K)
                r++;
            else if (r-l+1 == K){
                if(sum > max)
                    max=sum;
                sum-= Arr.get(l);
                l++;
                r++;
            }
        }

        return max;
    }
}