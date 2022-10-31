package Leetcode;

/*
Given an integer num, return the number of steps to reduce it to zero.

In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */
public class NumberOfStepsto0 {
    public static int numberOfSteps(int num) {
        return steps(num ,0);
    }
    public static int steps(int num,int count){
        if (num<=0)
            return count;
        if (num%2==0){
            num /=2;
            count++;
        }
        else{
            num -= 1;
            count++;
        }
        return steps(num,count);
    }
    public static void main(String[] args) {
        int num =123;
        System.out.println(numberOfSteps(num));
    }
}
