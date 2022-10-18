package Leetcode;

import java.util.ArrayList;
import java.util.List;

/*
There are n kids with candies. You are given an integer array candies,
where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.
 */
public class Kid_with_Greatest_Candies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean>al = new ArrayList<>();
            int max=candies[0];
            for (int i=0;i<candies.length;i++){
                if (candies[i]>max)
                    max =candies[i];
            }
            for (int i=0;i<candies.length;i++){
                if (candies[i]+extraCandies >=max)
                    al.add(true);
                else
                    al.add(false);
            }
            return al;
    }
    public static void main(String[] args) {
        int []kids = {12,1,12};
        int candy = 10;
        List<Boolean>al = kidsWithCandies(kids,candy);
        System.out.println(al);
    }
}
