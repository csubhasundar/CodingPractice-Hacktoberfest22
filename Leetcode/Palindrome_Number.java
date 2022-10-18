package Leetcode;

/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 */
public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        for (int i=0;i<str.length()/2;i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int a = 12321;
        boolean ispalindrome = isPalindrome(a);
        System.out.println(ispalindrome);
    }
}
