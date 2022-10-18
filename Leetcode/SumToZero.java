package Leetcode;

import java.util.Arrays;

/*
Given an integer n, return any array containing n unique integers such that they add up to 0.
 */
public class SumToZero {
    public static int[] sumZero(int n) {
        int []arr= new int[n];
        for (int i=0; i<n/2;i++){
            arr[i] = -(i+1);
            arr[n-1-i] = i+1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int n =1;
        int []arr= sumZero(n);
        System.out.println(Arrays.toString(arr));
    }
}
