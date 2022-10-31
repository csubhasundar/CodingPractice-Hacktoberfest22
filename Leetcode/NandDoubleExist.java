package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

/*
Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 */
public class NandDoubleExist {
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer>hs = new HashSet<>();
        for(int a:arr){
            if (hs.contains(a*2) || hs.contains(a/2)&& a%2==0)
                return true;
            hs.add(a);
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,14,11};
        System.out.println(checkIfExist(arr));
    }
}
