package Leetcode;

/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n<1)
            return false;
        return (n&(n-1))==0;
    }

    public static void main(String[] args) {
        int n =16;
        System.out.println(isPowerOfTwo(n));
    }
}
