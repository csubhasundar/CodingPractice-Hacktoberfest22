package Leetcode;

/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */
public class median_of_two_array {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m = nums1.length;
            int n = nums2.length;
            int j=0;int k=0;
            int l = m+n;
            int []sort = new int[l];
            for (int i=0;i<l;i++){
                if (j<m && k<n){
                    if (nums1[j]<nums2[k]){
                        sort[i]= nums1[j];
                        j++;
                    }
                    else if (nums1[j]> nums2[k]){
                        sort[i]= nums2[k];
                        k++;
                    }
                    else {
                        sort[i]= nums1[j];
                        sort[i+1]= nums2[k];
                        i++;j++;k++;
                    }
                }
                else if(j<m){
                    sort[i]= nums1[j];
                    j++;
                }
                else{
                    sort[i]= nums2[k];
                    k++;
                }
            }
            if (l%2==1){
                return (double)sort[l/2];
            }
            else{
                return (double)( sort[l/2]+sort[l/2-1])/2;
            }
    }

    public static void main(String[] args) {
        int[]num1 = {1,3};
        int[]num2 = {2,4};
       double result= findMedianSortedArrays(num1,num2);
        System.out.println(result);
    }
}
