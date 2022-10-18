package Leetcode;

/*
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
 */
public class DivideTwoIntegerrs {
    public static int divide(int dividend, int divisor) {
        int n = Math.abs(divisor);
            int m = Math.abs(dividend);
        if(dividend==Integer.MIN_VALUE) {
            m = Integer.MAX_VALUE;
        }
        int count =0;
        while(m>=n ){
            m = m - n;
            count++;
        }
        if (dividend<0 && divisor<0)
            return count;
        if (divisor<0 || dividend<0)
            return count*-1;
        else
            return count;
    }

    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor =-1;
        System.out.println(divide(dividend,divisor));
    }
}
