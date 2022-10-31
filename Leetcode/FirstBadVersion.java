package Leetcode;

/*
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check.
Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class FirstBadVersion {
    static  boolean isBadVersion(int version){
        int bad =1;
        if (version==bad)
            return true;
        return false;
    }
    public static int firstBadVersion(int n) {
        return findBadVersion(1,n);
    }
    public static int findBadVersion(int s , int e){
        int mid = s + (e-s)/2;
        if(s<=e){
            if (isBadVersion(mid)){
                if(mid>s && isBadVersion(mid-1)){
                    return findBadVersion(s,mid-1);
                }else{
                    return mid;
                }
            }else{
                return findBadVersion(mid+1 ,e);
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int n = 1;
        System.out.println(firstBadVersion(n));
    }
}
