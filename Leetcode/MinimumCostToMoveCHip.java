package Leetcode;

/*
We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position.
 */
public class MinimumCostToMoveCHip {
    public static int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;
        for(int i : position){
            if (i%2==0)
                even++;
            else
                odd++;
        }
        return Math.min(even,odd);
    }
    public static void main(String[] args) {
        int chips[] ={1,1000000000};
        System.out.println(minCostToMoveChips(chips));
    }
}
