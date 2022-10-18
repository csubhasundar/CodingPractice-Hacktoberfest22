package Leetcode;

/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.
 */
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        return foundPerfectSquare(1 , num , num);
    }
    public static boolean foundPerfectSquare(long s , long e , int target){
        long mid = s + (e-s)/2;
        if(s<=e){
            if (mid*mid > target){
                return foundPerfectSquare(s , mid-1 ,target);
            }
            else if(mid*mid<target){
                return foundPerfectSquare(mid+1 , e ,target);
            }
            else
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n =2147483647;
        System.out.println(isPerfectSquare(n));
    }
}
