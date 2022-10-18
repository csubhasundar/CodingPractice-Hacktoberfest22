package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
The array-form of an integer num is an array representing its digits in left to right order.

For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
 */
public class ArrayFormOfInteger {
    public static void main(String[] args) {
        int []arr = {1,2,0,0};
        int k =18;
        List<Integer>al = addToArrayForm2(arr,k);
        System.out.println(al);
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>al = new ArrayList<>();
        int n =0;
        int j=1;
        for (int i=0;i< num.length;i++){
            n = n*j+num[i];
            j =10;
        }
        n += k;
        while (n>0){
            al.add(0 , n%10);
            n = n/10;
        }
        return al;
    }
    public static List<Integer> addToArrayForm2(int[] num, int k) {
        List<Integer>al = new ArrayList<>();
        int n =0;
        int i = num.length-1;
        while (k>0 || n>0 || i>=0){
            if (i>=0) {
                n = n + k % 10 + num[i];
                i--;
            }
            else {
                n = n + k % 10;
            }
            al.add(0 , n%10);
            n = n/10;
            k = k/10;
        }
       return al;
    }
}
