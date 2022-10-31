package Leetcode;

/*
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
 */
public class Pow_x_n_ {
    public static double myPow(double x, int n) {
        return Math.pow(x, n);
    }

    public static double myPow2(double x, int n) {
        double num = 0;
        if (n < 0) {
            x = 1 / x;
            num = x;
            for (int i = n; i < -1; i++) {
                num *= x;
            }
        } else if (n > 0) {
            num = x;
            for (int i = n; i > 1; i--)
                num *= x;
        } else {
            return 1.0;
        }
        return num;
    }

    public static void main(String[] args) {
        double n = 2.00000;
        int pow = 10;
        double ans = myPow2(n, pow);
        System.out.println(ans);
    }
}
