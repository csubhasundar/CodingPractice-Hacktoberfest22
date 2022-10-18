package Leetcode;

/*
An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.
 */
public class Peak_Index_in_Mountain_Array {
    public static int peakIndexInMountainArray(int[] arr) {

        return peakIndex(arr,0,arr.length-1);
    }
    public static int peakIndex(int []arr , int start ,int end){
        int mid =start +(end-start)/2;
        if (start<end){
            if (arr[mid]<arr[mid+1])
                return peakIndex(arr,mid+1 ,end);
            else if(arr[mid]> arr[mid+1])
                return peakIndex(arr,start,mid-1);
        }
        return mid;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,3,1};
        int peak = peakIndexInMountainArray(arr);
        System.out.println(peak);
    }
}
