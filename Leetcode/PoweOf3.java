package Leetcode;

/*
Given an integer n, return true if it is a power of three. Otherwise, return false.

An integer n is a power of three, if there exists an integer x such that n == 3x.


 */
public class PoweOf3 {
    public static boolean isPowerOfThree(int n) {
        double powOf3 = Math.log(n)/Math.log(3);
        int a = (int)powOf3/1+1;
        if (powOf3%1>=0.99){
            return (int)Math.pow(3,a)==n ?true:false;
        }
        return powOf3%1==0?true:false;
    }
    public static void main(String[] args) {
        int num = 243;
        boolean ans = isPowerOfThree(num);
        System.out.println(ans);
    }
}
