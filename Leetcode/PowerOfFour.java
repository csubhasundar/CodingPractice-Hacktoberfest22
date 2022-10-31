package Leetcode;

/*
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.
 */
public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n==0)
            return false;
        double num = Math.log(n)/Math.log(4);
        return num%1==0 ? true:false;

    }

    public static void main(String[] args) {
        int num = 64;
        boolean n = isPowerOfFour(num);
        System.out.println(n);
    }
}
