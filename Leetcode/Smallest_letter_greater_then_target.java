package Leetcode;

/*
Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 */
public class Smallest_letter_greater_then_target {
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int result = nextGretestindex(letters , start ,end ,target);
        return letters[result];
    }
    public static int nextGretestindex(char []letters , int start ,int end ,char target){
        if (target>letters[letters.length-1])
            return 0;
        if (start<=end){
            int mid = start +(end-start)/2;
            if (letters[mid]>target)
                return nextGretestindex(letters , start , mid-1 ,target);
            return nextGretestindex(letters , mid +1, end ,target);
        }
        return start%letters.length;
    }
    public static void main(String[] args) {
        char []arr = {'c','f','j'};
        char target = 'j';
        char result = nextGreatestLetter(arr,target);
        System.out.println(result);
    }
}
