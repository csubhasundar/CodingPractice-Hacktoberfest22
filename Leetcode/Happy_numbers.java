package Leetcode;

/*
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.
 */
public class Happy_numbers {
    public static boolean isHappy(int n) {
        if (n==1)
            return true;
        if(n<=4)
            return false;
        int num=0;
            while (n>0){
                num+= Math.pow(n%10,2);
                n /=10;
            }
            if (num != 1)
                return isHappy(num);
         return true;
    }

    public static void main(String[] args) {
        int n = 5;
        boolean ishappy = isHappy(n);
        System.out.println(ishappy);
    }
}
