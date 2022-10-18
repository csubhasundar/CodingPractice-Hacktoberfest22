package Leetcode;

/*
You are standing at position 0 on an infinite number line. There is a destination at position target.

You can make some number of moves numMoves so that:

On each move, you can either go left or right.
During the ith move (starting from i == 1 to i == numMoves), you take i steps in the chosen direction.
Given the integer target, return the minimum number of moves required (i.e., the minimum numMoves) to reach the destination.
 */
public class ReachANumber {
    public static int reachNumber(int target) {
        int numsNow = 0;
        int step = 0;
        int i=1;
        target = Math.abs(target);
        while(numsNow!=target){
            int left = target-numsNow;
            if (left<i){
                numsNow -= i;
                step++;
            }
            else{
                numsNow+=i;
                step++;
            }
            i++;
        }
        return step;
    }
    public static int reachNumber2(int target) {
        int sum =0 ,steps = 0;
        target = Math.abs(target);
        while(sum< target){
            sum+=steps;
            steps++;
        }

        while(((sum-target)%2!=0)){
            sum+=steps;
            steps++;
        }
        return steps-1;

    }
    public static void main(String[] args) {
        int target = 3;
        int reachNumber = reachNumber2(target);
        System.out.println(reachNumber);
    }
}
