package Leetcode;

/*
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes.
The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude
between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
 */
public class HighestAltitude {
    public static int largestAltitude(int[] gain) {
        int highestAltitude=0;
        int altitude=0;
        for (int i=0;i<gain.length;i++){
           altitude += gain[i];
           if (altitude>highestAltitude)
               highestAltitude =altitude;
        }
        return highestAltitude;
    }
    public static void main(String[] args) {
        int []arr={-4,-3,-2,-1,4,3,2};
        int altitude = largestAltitude(arr);
        System.out.println(altitude);
    }
}
