package Leetcode;

/*
You may recall that an array arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.

You cannot access the mountain array directly. You may only access the array using a MountainArray interface:

MountainArray.get(k) returns the element of the array at index k (0-indexed).
MountainArray.length() returns the length of the array.
Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer. Also, any solutions that attempt to circumvent the judge will result in disqualification.
 */
public class Find_In_Mountain_Array {
    public static int findInMountainArray(int[] arr,int target) {
        int peak= peakIndex(arr, 0 ,arr.length-1);
        int index1 = findIndex(arr,0,peak,target ,true);
        if (index1==-1) {
            int index2 = findIndex(arr, peak + 1, arr.length - 1, target,false);
            return index2;
        }
        return index1;
    }
    public  static  int peakIndex(int []arr , int start , int end){
        int mid =start +(end-start)/2;
        if (start<end){
            if (arr[mid]<arr[mid+1])
                return peakIndex(arr,mid+1 ,end);
            else if(arr[mid]> arr[mid+1])
                return peakIndex(arr,start,mid-1);
        }
        return mid;
    }
    public  static  int findIndex(int []arr, int start ,int end ,int target,boolean left){
        int mid = start +(end-start)/2;
       if (start<=end){
           if (arr[mid]>target){
               if (left){
                    return findIndex(arr, start ,mid-1 ,target,true);}
               else{
               return findIndex(arr, mid+1 ,end ,target,false);}
           }
           else if (arr[mid]<target){
               if (left){
                   return findIndex(arr,mid+1 , end,target,true);}
               else{
                   return findIndex(arr, start ,mid-1,target,false);}
           }
            return mid;
       }
       return -1;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,5,6,4,3,2,1,0};
        int target =0;
        int peak = findInMountainArray(arr,target);
        System.out.println(peak);
    }
}

