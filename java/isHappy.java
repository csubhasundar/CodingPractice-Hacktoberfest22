import java.util.Scanner;

public class isHappy {

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        else {
        return false;
        }
    }

    public static int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10 ;
            ans += rem * rem;
            number /= 10;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int number = input.nextInt();
        if ( isHappy(number)){
            System.out.print(number+" is a happy number");
        }
        else {System.out.print(number+" is not a happy number");
    }
    }
}
