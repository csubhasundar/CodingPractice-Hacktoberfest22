package Leetcode;

/*
You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.

The population of some year x is the number of people alive during that year.
The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1].
Note that the person is not counted in the year that they die.

Return the earliest year with the maximum population.
 */
public class MaximumPopulationYear {
    public static int maximumPopulation(int[][] logs) {

        int [] arr = new int[101];

        for(int i=0;i<logs.length;i++){
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }

        for(int i = 1;i<101;i++){
            arr[i] += arr[i-1];
        }

        int maxPopulation = 0;
        int year = 0;
        for(int i = 0;i<101;i++){
            if(arr[i] > maxPopulation){
                maxPopulation = arr[i];
                year = i + 1950;
            }
        }
        return year;
    }

    public static void main(String[] args) {
        int[][]logs= {{1993,1999},{2000,2010}};
        int year = maximumPopulation(logs);
        System.out.println(year);
    }
}

