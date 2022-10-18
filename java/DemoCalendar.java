import java.util.*;

class result {
    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        c.set(Calendar.MONTH, month-1);
        c.set(Calendar.DATE, day);
        c.set(Calendar.YEAR, year);
        int dayOFWEEk = c.get(Calendar.DAY_OF_WEEK);
        String date;
        switch (dayOFWEEk) {
            case 1 -> date ="SUNDAY";
            case 2 -> date = "MONDAY";
            case 3 -> date = "TUESDAY";
            case 4 -> date = "WEDNESDAY";
            case 5 -> date = "THURSDAY";
            case 6 -> date = "FRIDAY";
            case 7 -> date = "SATURDAY";
            default -> throw new IllegalStateException("Unexpected value: " + dayOFWEEk);
        }
        return date;
    }
}


class Solution {

    public void getSmallestAndLargest(String s , int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String []arr = new String[s.length()-(k-1)];
        for(int i = 0; i< arr.length;i++){
            String non = "";
            for(int j = i; j<i+k ; j++){
                non += s.charAt(j);
            }
            arr[i] = non;
            System.out.println(arr[i]);
        }
        String []arr1 = new String[s.length()-(k-1)];
        for(int i = 0; i< arr1.length;i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[j].charAt(i)==arr[j+1].charAt(i)){
                    if(arr[j].charAt(i+1)==arr[j+1].charAt(i+1)){

                    }
                    else if(arr[j].charAt(i+1)>arr[j+1].charAt(i+1)){
                        arr1[i] = arr[j];
                    }
                    else{
                        arr1[i] = arr[j+1];
                    }
                }
                else  if(arr[j].charAt(i)> arr[j+1].charAt(i)){
                    arr1[i] = arr[j];
                }
                else{
                    arr1[i] = arr[j];
                }
            }

        }
            }
        }


interface AdvancedArithmetic{
    int divisor_sum(int n);
}
class  MyCalculator implements AdvancedArithmetic{
    public int divisor_sum(int n){
        int sum = 0;
        for(int i= 1; i<=n;i++){
            if(n%i == 0){
                sum += i;
            }
        }
        return sum;
    }
}

public class DemoCalendar {
    public static void main(String[] args) {
        MyCalculator c = new MyCalculator();
        int s = c.divisor_sum(6);
        System.out.println(s);
    }
}
