package Leetcode;

import java.util.ArrayList;

/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.
 */
public class KthMissingNumber {
    public static int findKthPositive(int[] arr, int k) {
        int i=0;
        int current = 1;
        int missing =0;
        while (k>0){
            if(i<arr.length){
                if (current==arr[i]){
                    current++;
                    i++;
                }
                else{
                    missing = current;
                    k--;
                    current++;
                }
            }
            else{
                missing =current;
                current++;
                k--;
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k =2;
        System.out.println(findKthPositive(arr,k));
    }
}
