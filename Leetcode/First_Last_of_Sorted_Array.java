package Leetcode;

import java.util.Arrays;

/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.
 */
public class First_Last_of_Sorted_Array {
    public static int[] searchRange(int[] nums, int target) {
        int range[] = new int[2];
        int start = findRange(nums,target,true);
        int end = findRange(nums,target,false);
        range[0]=start;
        range[1]=end;
        return range;
    }
    public static int findRange(int []arr ,int target,boolean startIndex){
        int ans =-1;
        int start = 0;
        int end = arr.length-1;
       while (start<=end){
           int mid =start +(end-start)/2;
           if (arr[mid]==target) {
               ans = mid;
               if (startIndex)
                   end = mid - 1;
               else
                   start = mid + 1;
           }
           else if (arr[mid]>target)
               end =mid-1;
           else
               start =mid+1;
       }
       return ans;
    }


    public static int[] searchRange2(int[] nums, int target) {
        int range[] = new int[2];
        int start = findFirstIndex(nums,0,nums.length-1,target,true ,-1);
        int end = findFirstIndex(nums,0,nums.length-1,target,false , -1);
        range[0]=start;
        range[1]=end;
        return range;
    }
    public static int findFirstIndex(int []arr ,int start ,int end,int target,boolean startIndex ,int ans){
       if (start<=end){
           int mid =start +(end-start)/2;
           if (mid != arr.length &&arr[mid]==target) {
                ans =mid;
                if (startIndex)
                return findFirstIndex(arr,start,mid-1,target,startIndex,ans);
                return findFirstIndex(arr,mid+1,end,target,startIndex ,ans);
           }
           else if (arr[mid]>target)
                  return   findFirstIndex(arr,0,mid-1,target,startIndex,ans);
           else
                 return    findFirstIndex(arr,mid+1,end,target,startIndex,ans);
       }
       return ans;
    }
    public static void main(String[] args) {
        int []arr= {};
        int target = 2;
        int range[] = searchRange2(arr ,target);
        System.out.println(Arrays.toString(range));
    }
}
