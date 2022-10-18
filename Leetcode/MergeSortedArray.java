package Leetcode;

import java.util.Arrays;

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function,
 but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements
 denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int merge[] = new int[m+n];
            int i=0;
            int j=0;
            int k=0;
            while (i<m && j<n){
                if (nums1[i]>nums2[j]){
                    merge[k] = nums2[j];
                    j++;
                }
                else if(nums1[i]<nums2[j]){
                    merge[k] = nums1[i];
                    i++;
                }
                else{
                    merge[k]= nums1[i];
                    merge[++k] = nums2[j];
                    i++;
                    j++;
                }
                k++;
            }
            while (i<m){
                merge[k]=nums1[i];
                k++;
                i++;
            }
            while (j<n){
                merge[k]=nums2[j];
                k++;
                j++;
            }
            for(int l=0;l<m+n;l++){
                nums1[l]=merge[l];
            }
    }

    public static void main(String[] args) {
        int num1[]= {1};
        int m =1;
        int num2[] = {0};
        int n =0;
        merge(num1,m,num2,n);
        System.out.println(Arrays.toString(num1));
    }
}
