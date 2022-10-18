package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
 */
public class SelfDivingNumber {
    public static List<Integer> selfDividingNumbers(int left, int right) {
            List<Integer>al =new ArrayList<>();
            for (int i=left;i<=right;i++){
                if (i<10 && i>0 ){
                    al.add(i);
                    continue;
                }
                int num =i;
                while (num>0){
                    int rem = num%10;
                    if (rem!=0 && i%rem==0)
                        num = num/10;
                    else
                        break;
                }
                if (num==0)
                    al.add(i);
            }
            return al;
    }

    public static void main(String[] args) {
        int left = 1;
        int right =100;
        List<Integer>al = selfDividingNumbers(left,right);
        System.out.println(al);
    }
}
